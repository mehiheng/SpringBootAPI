package com.example.crud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
public class employment implements employeeService{
    private static List<employee> employeeList;

    static {
        employeeList = set();
    }

    public static List<employee> set(){

        List<employee> employeeList = new ArrayList<employee>();
        employee a = new employee(0, "小明", 20, "男");
        employee b = new employee(1, "小红", 19, "女");
        employee c = new employee(2, "小智", 15, "男");
        employee d = new employee(3, "小刚", 16, "男");
        employee e = new employee(4, "小霞", 15, "女");
        employeeList.add(a);
        employeeList.add(b);
        employeeList.add(c);
        employeeList.add(d);
        employeeList.add(e);
        return employeeList;
}


    @Override
    public List<employee> findAll() {
        return employeeList;
    }
}

