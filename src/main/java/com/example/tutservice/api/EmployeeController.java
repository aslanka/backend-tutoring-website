package com.example.tutservice.api;

import com.example.tutservice.model.Employee;

import com.example.tutservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin("*")
@RequestMapping("/api/v1/Tutor")
@RestController
@AllArgsConstructor
public class EmployeeController {




    private final EmployeeService employeeService;

    @PostMapping
    public void addTutor(@RequestBody Employee employee){
        employeeService.insertTutor(employee);
    }



    @GetMapping
    public List<Employee> fetchAllStudents(){
        return employeeService.getAllTutors();
    }

    @GetMapping(path= "{full_name}")
    public List<Employee> fetchTutorByName(@PathVariable("full_name") String full_name){

        return employeeService.fetchTutorByName(full_name);
    }


}

