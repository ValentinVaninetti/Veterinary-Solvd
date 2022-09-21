package com.solvd.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao <K, I>{
    void insert(K k) throws SQLException;
    void update(K k);
    void delete(K k);
    List <K> getAll() throws SQLException;
    K getById(K id);
}
