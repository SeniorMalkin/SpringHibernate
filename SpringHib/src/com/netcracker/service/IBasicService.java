package com.netcracker.service;

import java.util.List;

public interface IBasicService<T> {
    T findById(int id);
    void updateById(int id, T entity);
    List<T> getAll();
    void  deleteById(int id);
    Long countRec();
}
