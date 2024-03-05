package com.example.springdemo.repository;

import com.example.springdemo.entity.customerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepo extends JpaRepository<customerEntity, Long> {
}
