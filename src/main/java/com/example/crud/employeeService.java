package com.example.crud;

import java.util.List;

interface employeeService {

        List<employee> add(employee employee);
        List<employee> findAll();
        employee getById(int id);
        List<employee> deleteById(int id);

        List<employee> updateEmployee(Integer id, employee employee);
}
