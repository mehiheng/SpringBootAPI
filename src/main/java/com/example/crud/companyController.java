package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class companyController {

    @Autowired
    companyService companyService;

    @GetMapping("/companies")
    public List<String> listAll(){
        return companyService.findAll();
    }
}
