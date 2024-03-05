package com.example.springdemo.controller;

import com.example.springdemo.entity.customerEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdemo.service.customerService;

import java.util.List;
@AllArgsConstructor
@RestController
public class customerController {

    private customerService customerService;

    @PostMapping("api/create")
    public ResponseEntity<customerEntity> apiTest(@RequestBody customerEntity param ){
        customerEntity postData = customerService.createCustomer(param);
        return new ResponseEntity<>(postData, HttpStatus.CREATED);
    }

//    @GetMapping("api/get")
//    public ResponseEntity<customerEntity> getall(){
//        List<customerEntity> res = customerEntity.getAllCustomer();
//        return new ResponseEntity<>(res, HttpStatus.CREATED);
//    }


    //    @GetMapping("api/get")
//    public ResponseEntity<customerEntity> getall(){
//        List<customerEntity> res = customerEntity.getAllCustomer();
//        return new ResponseEntity<>(res, HttpStatus.CREATED);
//    }
}
