package com.netcracker.service;

import com.netcracker.dao.IBasicDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasicService<T> {
    @Autowired
    IBasicDao<T> dao;
    public T findById(int id) {
        return dao.findById(id);
    }

    public void updateById(int id, T entity) {
        dao.updateById(id,entity);
    }

    public List<T> getAll() {
        return dao.getAll();
    }

    public void deleteById(int id) {
        dao.deleteById(id);

    }
    public Long countRec() {
        return dao.countRec();
    }
}
