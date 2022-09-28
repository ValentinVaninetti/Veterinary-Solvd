package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.pojos.Veterinary;
import com.solvd.enums.TableColumn;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class VeterinaryDaoImpl implements IVeterinaryDao {
    PreparedStatement statement;
    Connection connection;

    public VeterinaryDaoImpl() {
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param veterinary
     * @throws SQLException
     */
    @Override
    public void insert(Veterinary veterinary) throws SQLException {
        connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTVETERINARY);
        insertVeterinary(veterinary);
        this.statement.executeUpdate();
    }

    private void insertVeterinary(Veterinary veterinary) throws SQLException {
        this.statement.setString(TableColumn.VETERINARYNAME.index, veterinary.getVetName());
        this.statement.setString(TableColumn.VETERINARYCITY.index, veterinary.getCity());
        this.statement.setString(TableColumn.VETERINARYADDRESS.index, veterinary.getAddress());
    }

    /**
     * @param veterinary
     */
    @Override
    public void update(Veterinary veterinary) {

    }

    /**
     * @param veterinary
     */
    @Override
    public void delete(Veterinary veterinary) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Veterinary> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Veterinary getById(Integer id) {
        return null;
    }
}
