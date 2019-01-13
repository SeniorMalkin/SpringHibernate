package com.netcracker.dao;

import com.netcracker.model.Book;

import java.util.List;

public interface IBookDao extends IBasicDao<Book> {
    List<Book> find(String title);
    List<String> findTitle();
    List<Float> findCost();
}
