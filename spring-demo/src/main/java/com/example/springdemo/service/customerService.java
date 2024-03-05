package com.example.springdemo.service;

import com.example.springdemo.entity.customerEntity;

import java.util.List;

public interface  customerService {
    List<customerEntity> getAllCustomer();
    customerEntity getCustomerById (Long id);
    customerEntity createCustomer(customerEntity customerEntity);
}
