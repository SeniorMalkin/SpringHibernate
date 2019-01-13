package com.netcracker.dao;

import java.util.List;

public interface IBasicDao<T> {
    void save(T entity);
    void deleteByObject(T entity);
    T findById(int id);
    void  deleteById(int id);
    void updateById(int id,T entity);
    List<T> getAll();
    Long countRec();
}
