package com.example.crud;

import java.util.List;

interface employeeService {

        List<employee> add(employee employee);
        List<employee> findAll();
        List<employee> getById(String id);
        List<employee> deleteById(int id);
        List<employee> updateEmployee(Integer id, employee employee);
        List<employee> getByPage(int num, int page);
}
