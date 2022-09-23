package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Doctor;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DoctorDaoImpl implements IDoctorDao {
    PreparedStatement statement;
    Connection connection;
    public DoctorDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }
    /**
     * @param doctor
     * @throws SQLException
     */
    @Override
    public void insert(Doctor doctor) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTDOCTOR);
        insertDoctor(doctor);
        this.statement.executeUpdate();
    }

    private void insertDoctor(Doctor doctor) throws SQLException {
        this.statement.setString(TableColumn.DOCTORNAME.index, doctor.getName());
        this.statement.setInt(TableColumn.DOCTORAGE.index, doctor.getAge());
        this.statement.setInt(TableColumn.DOCTOREXPERIENCE.index, doctor.getExperience());
    }

    /**
     * @param doctor
     */
    @Override
    public void update(Doctor doctor) {

    }

    /**
     * @param doctor
     */
    @Override
    public void delete(Doctor doctor) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Doctor> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Doctor getById(Doctor id) {
        return null;
    }
}
