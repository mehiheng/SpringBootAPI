package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class employeeController {

    @Autowired
    employeeService employeeService;
    //查询全部
    @RequestMapping ("/employees")
    public List<employee> listAll(){
        return employeeService.findAll();
    }
    //添加
    @PostMapping( "/employees")
    public List<employee> add(@RequestBody employee employees) {
        return employeeService.add(employees);
    }
    //根据ID筛选&&性别筛选
    @GetMapping("/employees/{id}")
    public List<employee> getById(@PathVariable String id){
        return employeeService.getById(id);
    }
    //删除
    @DeleteMapping("/employees/{id}")
    public List<employee> deleteById(@PathVariable int id){
        return employeeService.deleteById(id);
    }
    //更新
    @PutMapping(("/employees/{id}"))
    public List<employee> updateEmployee(@PathVariable Integer id, @RequestBody employee employee) {
        return employeeService.updateEmployee(id, employee);

    }
}