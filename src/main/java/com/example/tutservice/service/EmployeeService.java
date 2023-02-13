package com.example.tutservice.service;

import com.example.tutservice.dao.EmployeeRepository;
import com.example.tutservice.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository tutorRepository;

    public List<Employee> getAllTutors(){
        return tutorRepository.findAll();
    }

    public void insertTutor(Employee employee){
        tutorRepository.insert(employee);

    }

    public List<Employee> fetchTutorByName(String name){
        return tutorRepository.findAllByFullName(name);
    }



}
