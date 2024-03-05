package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

//	controller --> api functions
//	entity --> api fields

//	repo --->  customerRepo extends  JpaRepository ( JpaRepository db interaction method  extends to customerRepo )

//	service --> service interface --> service imb -->  customerRepo ( using db interaction without  sql query like find() ect .. )

//	j0b


}
