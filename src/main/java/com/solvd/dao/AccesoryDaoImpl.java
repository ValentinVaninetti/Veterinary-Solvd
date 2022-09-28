package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.pojos.Accesory;
import com.solvd.enums.TableColumn;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoryDaoImpl implements IAccesoryDao {

    PreparedStatement statement;
    Connection connection;
    ResultSet rs;

    public AccesoryDaoImpl() {
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param accesory
     */
    @Override
    public void insert(Accesory accesory) throws SQLException {
        prepareQuery(Querys.INSERTACCESORY);
        insertAccesory(accesory);
        this.statement.executeUpdate();
        this.connection.close();

    }

    private void insertAccesory(Accesory accesory) throws SQLException {
        this.statement.setString(TableColumn.ACCESORYNAME.index, accesory.getName());
        this.statement.setString(TableColumn.ACCESORYTYPE.index, accesory.getType());
        this.statement.setInt(TableColumn.ACCESORYSTOCK.index, accesory.getStock());
    }

    /**
     * @param accesory
     */
    @Override
    public void update(Accesory accesory) throws SQLException {
        prepareQuery(Querys.UPDATEACCESORY);
        this.statement.setString(TableColumn.ACCESORYNAME.index, accesory.getName());
        this.statement.setString(TableColumn.ACCESORYTYPE.index, accesory.getType());
        this.statement.setInt(TableColumn.ACCESORYSTOCK.index, accesory.getStock());
        this.statement.setInt(4, accesory.getId());
        this.statement.executeUpdate();
        this.connection.close();
    }

    /**
     * @param accesory
     */
    @Override
    public void delete(Accesory accesory) throws SQLException {
        prepareQuery(Querys.DELETEACCESORY);
        this.statement.setInt(1, accesory.getId());
    }

    @Override
    public List<Accesory> getAll() throws SQLException {
        List<Accesory> accesories = new ArrayList<>();
        PreparedStatement statement = null;
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        statement = s.prepareStatement(Querys.GETALLACCESORY);
        this.rs = statement.executeQuery();
        while (rs.next()) {
            accesories.add(getAccesory(rs));
        }
        return accesories;

    }

    private Accesory getAccesory(ResultSet rs) throws SQLException {
        Accesory ac = new Accesory();
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
    public Accesory getById(Integer id) throws SQLException {
        prepareQuery(Querys.GETACCESORYBYID);
        this.statement.setInt(TableColumn.ACCESORYID.index, id);
        this.rs = this.statement.executeQuery();
        this.rs.next();
        return getAccesory(this.rs);
    }

    private void prepareQuery(String query) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(query);
    }
}
