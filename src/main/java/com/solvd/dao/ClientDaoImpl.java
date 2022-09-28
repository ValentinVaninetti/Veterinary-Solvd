package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Client;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClientDaoImpl implements IClientDao {
    ResultSet rs;
    PreparedStatement statement;
    Connection connection;

    public ClientDaoImpl() {
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
    public void delete(Client client) throws SQLException {
        prepareQuery(Querys.DELETECLIENT);
        this.statement.setInt(TableColumn.CLIENTID.index, client.getId());
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
    public Client getById(Integer id) throws SQLException {
        prepareQuery(Querys.GETCLIENTBYID);
        this.statement.setInt(TableColumn.CLIENTID.index, id);
        this.rs = this.statement.executeQuery();
        this.rs.next();
        return getClient(this.rs);
    }
    private void prepareQuery(String query) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(query);
    }
    private Client getClient(ResultSet rs) throws SQLException {
        Client cl = new Client();
        cl.setId(rs.getInt("id_accesorie"));
        cl.setName(rs.getString("accesorieName"));
        cl.setAge(rs.getInt("clientAge"));
        cl.setPetName(rs.getString("clientPet"));
        return cl;
    }
}
