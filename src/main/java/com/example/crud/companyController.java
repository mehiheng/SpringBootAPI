package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //添加公司
    @PostMapping( "/companies")
    public List<company> addCompany(@RequestBody company companies) {
        return companyService.addCompany(companies);
    }
    //更新公司
    @PutMapping("/companies/{id}")
    public List<company> updateCompany(@PathVariable int id, @RequestBody company companies){
        return companyService.updateCompany(id,companies);
    }
    //删除公司
    @DeleteMapping("/companies/{id}")
    public List<company> deleteCompany(@PathVariable int id){
        return companyService.deleteCompany(id);
    }
}
