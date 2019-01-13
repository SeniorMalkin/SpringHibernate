package com.netcracker.dao;

import com.netcracker.model.Customer;
import com.netcracker.model.Purchase;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository("customerDAO")
@Transactional
public class CustDAOImpl extends BasicDAO<Customer> implements ICustDao {

    public List<Customer> find(String surname) {
        Query query = getSession().createQuery("FROM Customer WHERE surname = :surname");
        query.setString("surname",surname);
        return (List<Customer>) query.list();
    }

    public void updateById(int id, Customer entity) {
        Query query = getSession().createQuery("UPDATE Customer set surname = :surname, district = :district, discount = :discount WHERE id = :id");
        query.setInteger("id",id);
        query.setString("surname",entity.getSurname());
        query.setString("district",entity.getDistrict());
        query.setInteger("discount",entity.getDiscount());
        query.executeUpdate();
    }



    public List<String> findDist() {
        Query query = getSession().createQuery("SELECT DISTINCT district FROM Customer");
        return (List<String>) query.list();
    }

    public List<String> customNizeg() {
        Query query = getSession().createQuery("FROM Customer WHERE district = :district");
        query.setString("district","Nizegorodskiy");
        List<String> res = new ArrayList<String>();
        for(Customer a : (List<Customer>) query.list()){
            String str = "Surname: " + a.getSurname() +
                    ", Discount: " + a.getDiscount();
            res.add(str);

        }
        return res;
    }
}
