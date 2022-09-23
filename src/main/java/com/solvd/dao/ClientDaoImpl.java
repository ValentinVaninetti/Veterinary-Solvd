package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Accesorie;
import com.solvd.pojos.Client;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClientDaoImpl implements IClientDao {
    PreparedStatement statement;
    Connection connection;
    public ClientDaoImpl(){
        SingletonDatabaseConnection.getInstance();
    }
    /**
     * @param client
     * @throws SQLException
     */
    @Override
    public void insert(Client client) throws SQLException {
    this.connection = SingletonDatabaseConnection.getConnection();
    this.statement = connection.prepareStatement(Querys.INSERTCLIENT);
    insertClient(client);
    statement.executeUpdate();

    }
    private void insertClient(Client client) throws SQLException {
        this.statement.setString(TableColumn.CLIENTNAME.index, client.getName());
        this.statement.setInt(TableColumn.CLIENTAGE.index, client.getAge());
        this.statement.setString(TableColumn.CLIENTPETNAME.index, client.getPetName());
    }

    /**
     * @param client
     */
    @Override
    public void update(Client client) {

    }

    /**
     * @param client
     */
    @Override
    public void delete(Client client) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Client> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Client getById(Client id) {
        return null;
    }
}
