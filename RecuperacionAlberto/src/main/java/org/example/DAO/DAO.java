package org.example.DAO;

import java.util.ArrayList;

public interface DAO<T> {

    void add(T obj);

    void update(T obj);

    T find(int id);

    ArrayList<T> findAll();

}
