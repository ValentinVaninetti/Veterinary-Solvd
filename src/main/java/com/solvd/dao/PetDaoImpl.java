package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Pet;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PetDaoImpl implements IPetDao {

    PreparedStatement statement;
    Connection connection;
    public PetDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }
    /**
     * @param pet
     * @throws SQLException
     */
    @Override
    public void insert(Pet pet) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTPET);
        insertPet(pet);
        this.statement.executeUpdate();
    }

    private void insertPet(Pet pet) throws SQLException {
        this.statement.setString(TableColumn.PETSPECIE.index, pet.getSpecie());
        this.statement.setString(TableColumn.PETNAME.index, pet.getName());
        this.statement.setInt(TableColumn.PETAGE.index, pet.getAge());
        this.statement.setString(TableColumn.PETOWNER.index, pet.getOwnerName());
    }

    /**
     * @param pet
     */
    @Override
    public void update(Pet pet) {

    }

    /**
     * @param pet
     */
    @Override
    public void delete(Pet pet) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Pet> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Pet getById(Integer id) {
        return null;
    }
}
