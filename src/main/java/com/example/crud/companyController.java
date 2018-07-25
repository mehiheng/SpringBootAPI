package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class companyController {

    @Autowired
    companyService companyService;
    //公司列表
    @GetMapping("/companies")
    public List<String> listAll(){
        return companyService.findAll();
    }
    //具体公司
    @GetMapping("/companies/{i}")
    public company findCompany(@PathVariable int i){
        return companyService.findCompany(i);
    }
    //具体公司的员工
    @GetMapping("/companies/{i}/employees")
    public List<employee> findCompanyEmployees(@PathVariable int i){
        return companyService.findCompanyEmployees(i);
    }
}
