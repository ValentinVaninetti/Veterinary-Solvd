package com.solvd.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao <K, I>{
    void insert(K k) throws SQLException;
    void update(K k) throws SQLException;
    void delete(K k) throws SQLException;
    List <K> getAll() throws SQLException;
    K getById(K id);
}
