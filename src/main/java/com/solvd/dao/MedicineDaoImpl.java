package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Medicine;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MedicineDaoImpl implements IMedicineDao {
    PreparedStatement statement;
    Connection connection;
    public MedicineDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }
    /**
     * @param medicine
     * @throws SQLException
     */
    @Override
    public void insert(Medicine medicine) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTMED);
        insertMed(medicine);
        this.statement.executeUpdate();
    }

    private void insertMed(Medicine medicine) throws SQLException {
        this.statement.setString(TableColumn.MEDNAME.index, medicine.getName());
        this.statement.setInt(TableColumn.MEDSTOCK.index, medicine.getStock());
        this.statement.setInt(TableColumn.MEDPRICE.index, medicine.getPrice());
    }

    /**
     * @param medicine
     */
    @Override
    public void update(Medicine medicine) {

    }

    /**
     * @param medicine
     */
    @Override
    public void delete(Medicine medicine) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Medicine> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Medicine getById(Medicine id) {
        return null;
    }
}
