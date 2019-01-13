package com.netcracker.dao;

import com.netcracker.model.Customer;

import java.util.List;

public interface ICustDao extends IBasicDao<Customer> {
    List<Customer> find(String title);
    List<String>  findDist();
    List<String>  customNizeg();
}
