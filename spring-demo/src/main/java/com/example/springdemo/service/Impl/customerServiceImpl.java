package com.example.springdemo.service.Impl;

import com.example.springdemo.entity.customerEntity;
import com.example.springdemo.service.customerService;
import com.example.springdemo.repository.customerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@AllArgsConstructor
@Service
public  class customerServiceImpl implements customerService {

    private  customerRepo customerRepo;
    @Override
    public List<customerEntity> getAllCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public customerEntity getCustomerById(Long id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public customerEntity createCustomer(customerEntity customerEntity) {
        return customerRepo.save(customerEntity);
    }
}
