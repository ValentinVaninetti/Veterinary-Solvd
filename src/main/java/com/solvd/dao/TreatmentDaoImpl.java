package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Treatment;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TreatmentDaoImpl implements ITreatmentDao {

    PreparedStatement statement;
    Connection connection;
    public TreatmentDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }
    /**
     * @param treatment
     * @throws SQLException
     */
    @Override
    public void insert(Treatment treatment) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTTREATMENT);
        insertTreatment(treatment);
        this.statement.executeUpdate();
    }

    private void insertTreatment(Treatment treatment) throws SQLException {
        this.statement.setString(TableColumn.TREATMENTNAME.index, treatment.getTreatmentName());
        this.statement.setString(TableColumn.TREATEDPET.index, treatment.getPetName());
        this.statement.setDate(TableColumn.TREATMENTDATE.index, (Date) treatment.getTreatmentDate());
        this.statement.setInt(TableColumn.TREATMENTPRICE.index, treatment.getPrice());
        this.statement.setString(TableColumn.TREATEDBY.index, treatment.getDoctorName());
    }

    /**
     * @param treatment
     */
    @Override
    public void update(Treatment treatment) {

    }

    /**
     * @param treatment
     */
    @Override
    public void delete(Treatment treatment) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Treatment> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Treatment getById(Treatment id) {
        return null;
    }
}
