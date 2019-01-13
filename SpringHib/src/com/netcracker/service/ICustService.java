package com.netcracker.service;

import com.netcracker.model.Customer;

import java.util.List;

public interface ICustService extends IBasicService<Customer> {
    void saveCustomer(Customer entity);
    void deleteCustomer(Customer entity);
    List<Customer> findBySurname(String surname);
    List<String> getAllDistrict();
    List<String> getCustomersNizegorodkogoD();
}
