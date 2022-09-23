package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Payment;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PaymentDaoImpl implements IPaymentDao {
    PreparedStatement statement;
    Connection connection;
    public PaymentDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param payment
     * @throws SQLException
     */
    @Override
    public void insert(Payment payment) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTPAYMENT);
        insertPayment(payment);
        this.statement.executeUpdate();
    }

    private void insertPayment(Payment payment) throws SQLException {
        this.statement.setString(TableColumn.PAYMENTMETHOD.index, payment.getPaymentMethod());
        this.statement.setInt(TableColumn.PAYMENTPRICE.index, payment.getPrice());
        this.statement.setString(TableColumn.PAYMENTINFO.index, payment.getInfo());
        this.statement.setDate(TableColumn.PAYMENTDATE.index, (Date) payment.getPaymentDate());
    }

    /**
     * @param payment
     */
    @Override
    public void update(Payment payment) {

    }

    /**
     * @param payment
     */
    @Override
    public void delete(Payment payment) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Payment> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Payment getById(Payment id) {
        return null;
    }
}
