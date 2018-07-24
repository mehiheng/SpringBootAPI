package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class employeeController {

    @Autowired
    employeeService employeeService;

    @RequestMapping ("/employees")
    public List<employee> listAll(){
        return employeeService.findAll();
    }

    @PostMapping( "/employees")
    public List<employee> add(@RequestBody employee employees) {
        return employeeService.add(employees);
    }

    @GetMapping("/employees/{id}")
    public employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    @DeleteMapping("/employees/{id}")
    public List<employee> deleteById(@PathVariable int id){
        return employeeService.deleteById(id);
    }

}