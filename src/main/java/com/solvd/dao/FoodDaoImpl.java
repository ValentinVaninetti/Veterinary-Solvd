package com.solvd.dao;

import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.enums.TableColumn;
import com.solvd.pojos.Food;
import com.solvd.utils.Querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FoodDaoImpl implements IFoodDao {
    PreparedStatement statement;
    Connection connection;

    public FoodDaoImpl() {
        SingletonDatabaseConnection.getInstance();
    }

    /**
     * @param food
     * @throws SQLException
     */
    @Override
    public void insert(Food food) throws SQLException {
        this.connection = SingletonDatabaseConnection.getConnection();
        this.statement = this.connection.prepareStatement(Querys.INSERTFOOD);
        insertFood(food);
        this.statement.executeUpdate();
    }

    private void insertFood(Food food) throws SQLException {
        this.statement.setString(TableColumn.FOODNAME.index, food.getName());
        this.statement.setInt(TableColumn.FOODQUALITY.index, food.getQuality());
        this.statement.setInt(TableColumn.FOODPRICE.index, food.getPrice());
        this.statement.setInt(TableColumn.FOODSTOCK.index, food.getStock());
        this.statement.setString(TableColumn.FOODTYPE.index, food.getType());
    }

    /**
     * @param food
     */
    @Override
    public void update(Food food) {

    }

    /**
     * @param food
     */
    @Override
    public void delete(Food food) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Food> getAll() throws SQLException {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Food getById(Integer id) {
        return null;
    }
}
