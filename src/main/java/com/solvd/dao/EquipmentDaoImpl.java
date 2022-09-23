package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Equipment;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EquipmentDaoImpl implements IEquipmentDao {
    PreparedStatement statement;
    Connection connection;
    public EquipmentDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param equipment
     * @throws SQLException
     */
    @Override
    public void insert(Equipment equipment) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTEQUIPMENT);
        insertEquipment(equipment);
        this.statement.executeUpdate();
    }

    private void insertEquipment(Equipment equipment) throws SQLException {
        this.statement.setString(TableColumn.EQUIPMENTTYPE.index, equipment.getType());
        this.statement.setDate(TableColumn.EQUIPMENTDATE.index, (Date) equipment.getUsageDate());
    }

    /**
     * @param equipment
     */
    @Override
    public void update(Equipment equipment) {

    }

    /**
     * @param equipment
     */
    @Override
    public void delete(Equipment equipment) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Equipment> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Equipment getById(Equipment id) {
        return null;
    }
}
