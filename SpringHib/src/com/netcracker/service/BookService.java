package com.netcracker.service;

import com.netcracker.dao.IBookDao;
import com.netcracker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookService extends BasicService<Book> implements IBookService {
    @Autowired
    IBookDao dao;

    public void saveBook(Book entity) {
        dao.save(entity);
    }

    public void deleteBook(Book entity) {
        dao.deleteByObject(entity);
    }
    public List<Book> findByTitle(String title) {
        return dao.find(title);
    }

    public List<String> getAllTitle() {
        return dao.findTitle();
    }

    public List<Float> getAllCost() {
        return dao.findCost();
    }
}
