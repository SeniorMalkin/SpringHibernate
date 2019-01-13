package com.netcracker.service;
import com.netcracker.dao.ICustDao;
import com.netcracker.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("custService")
public class CustService extends BasicService<Customer> implements ICustService {

    @Autowired
    ICustDao dao;
    public void saveCustomer(Customer entity) {
        dao.save(entity);
    }

    public void deleteCustomer(Customer entity) {
        dao.deleteByObject(entity);
    }

    public List<Customer> findBySurname(String surname) {
        return dao.find(surname);
    }

    public List<String> getAllDistrict() {
        return dao.findDist();
    }

    public List<String> getCustomersNizegorodkogoD() {
        return dao.customNizeg();
    }
}
