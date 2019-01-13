package com.netcracker.dao;

import com.netcracker.model.Book;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("bookDAO")
@Transactional
public class BookDAOImpl extends BasicDAO<Book> implements IBookDao {

    public List<Book> find(String title) {
        Query query = getSession().createQuery("FROM Book WHERE title = :title");
        query.setString("title",title);
        return (List<Book>) query.list();
    }

    public void updateById(int id, Book entity) {
        Query query = getSession().createQuery("UPDATE Book set title = :title, cost = :cost, storage = :storage, bcount = :bcount WHERE id = :id");
        query.setInteger("id",id);
        query.setString("title",entity.getTitle());
        query.setFloat("cost",entity.getCost());
        query.setString("storage",entity.getStorage());
        query.setInteger("bcount",entity.getCount());
        query.executeUpdate();
    }


    public List<String> findTitle() {
        Query query = getSession().createQuery("SELECT DISTINCT title FROM Book");
        return (List<String>) query.list();
    }

    public List<Float> findCost() {
        Query query = getSession().createQuery("SELECT DISTINCT cost FROM Book");
        return (List<Float>) query.list();
    }
}
