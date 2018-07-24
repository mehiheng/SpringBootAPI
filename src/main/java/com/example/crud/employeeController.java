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

}