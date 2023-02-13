package com.example.tutservice.dao;

import com.example.tutservice.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.*;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query(value = "{'full_name' : ?0}")
    List<Employee> findAllByFullName(String full_name);

}
