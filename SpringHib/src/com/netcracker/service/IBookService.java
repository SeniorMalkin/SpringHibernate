package com.netcracker.service;

import com.netcracker.model.Book;

import java.util.List;

public interface IBookService extends IBasicService<Book> {
    void saveBook(Book entity);
    void deleteBook(Book entity);
    List<Book> findByTitle(String title);
    List<String> getAllTitle();
    List<Float> getAllCost();
}
