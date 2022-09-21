package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.pojos.Accesorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesorieDaoImpl  implements IAccesorieDao {
    final String INSERT = "INSERT INTO accesorie SET (accesorieName , accesorieType , accesorieStock) VALUES (?,?,?)";
    final String UPDATE = "UPDATE accesorie SET accesorieName = ?, accesorieType = ?, accesorieStock = ? WHERE id_accesorie = ?";
    final String DELETE = "DELETE FROM accesorie WHERE id_accesorie = ?";
    final String GETALL = "SELECT * FROM accesorie";
    final String GETBYID = "SELECT * FROM accesorie WHERE id_accesorie = ?";


    /**
     * @param accesorie
     */
    @Override
    public void insert(Accesorie accesorie) throws SQLException {
        PreparedStatement statement;
        ResultSet rs;
        SingletonDatabaseConnection.getInstance();
        Connection con = SingletonDatabaseConnection.getConnection();
        statement = con.prepareStatement(INSERT);

    }

    /**
     * @param accesorie
     */
    @Override
    public void update(Accesorie accesorie) {

    }

    /**
     * @param accesorie
     */
    @Override
    public void delete(Accesorie accesorie) {

    }
    @Override
    public List<Accesorie> getAll() throws SQLException {
    List <Accesorie> accesories = new ArrayList<>();
        PreparedStatement statement =  null;
        ResultSet rs;
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        statement = s.prepareStatement(GETALL);
        rs = statement.executeQuery();
        while(rs.next()){
            accesories.add(getAccesorie(rs));
        }
       return accesories;

    }
    private Accesorie getAccesorie (ResultSet rs) throws SQLException {
        Accesorie ac =  new Accesorie();
        ac.setId(rs.getLong("id_accesorie"));
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
    public Accesorie getById(Accesorie id) {
        return null;
    }
}
