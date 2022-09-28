package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.pojos.Accesorie;
import com.solvd.enums.TableColumn;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesorieDaoImpl implements IAccesorieDao {

    PreparedStatement statement;
    Connection connection;
    ResultSet rs;

    public AccesorieDaoImpl() {
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param accesorie
     */
    @Override
    public void insert(Accesorie accesorie) throws SQLException {
        prepareQuery(Querys.INSERTACCESORIE);
        insertAccesorie(accesorie);
        this.statement.executeUpdate();
        this.connection.close();

    }

    private void insertAccesorie(Accesorie accesorie) throws SQLException {
        this.statement.setString(TableColumn.ACCESORIENAME.index, accesorie.getName());
        this.statement.setString(TableColumn.ACCESORIETYPE.index, accesorie.getType());
        this.statement.setInt(TableColumn.ACCESORIESTOCK.index, accesorie.getStock());
    }

    /**
     * @param accesorie
     */
    @Override
    public void update(Accesorie accesorie) throws SQLException {
        prepareQuery(Querys.UPDATEACCESORIE);
        this.statement.setString(TableColumn.ACCESORIENAME.index, accesorie.getName());
        this.statement.setString(TableColumn.ACCESORIETYPE.index, accesorie.getType());
        this.statement.setInt(TableColumn.ACCESORIESTOCK.index, accesorie.getStock());
        this.statement.setInt(4, accesorie.getId());
        this.statement.executeUpdate();
        this.connection.close();
    }

    /**
     * @param accesorie
     */
    @Override
    public void delete(Accesorie accesorie) throws SQLException {
        prepareQuery(Querys.DELETEACCESORIE);
        this.statement.setLong(1, accesorie.getId());
    }

    @Override
    public List<Accesorie> getAll() throws SQLException {
        List<Accesorie> accesories = new ArrayList<>();
        PreparedStatement statement = null;
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        statement = s.prepareStatement(Querys.GETALLACCESORIES);
        this.rs = statement.executeQuery();
        while (rs.next()) {
            accesories.add(getAccesorie(rs));
        }
        return accesories;

    }

    private Accesorie getAccesorie(ResultSet rs) throws SQLException {
        Accesorie ac = new Accesorie();
        ac.setId(rs.getInt("id_accesorie"));
        ac.setName(rs.getString("accesorieName"));
        ac.setType(rs.getString("accesorieType"));
        ac.setStock(rs.getInt("accesorieStock"));
        return ac;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Accesorie getById(Integer id) throws SQLException {
        prepareQuery(Querys.GETACCESORIEBYID);
        this.statement.setInt(TableColumn.ACCESORIEID.index, id);
        this.rs = this.statement.executeQuery();
        this.rs.next();
        return getAccesorie(this.rs);
    }

    private void prepareQuery(String query) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(query);
    }
}
