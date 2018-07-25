package com.example.crud;

import java.util.List;

interface companyService {
    List<String> findAll();
    company findCompany(int i);
    List<employee> findCompanyEmployees(int i);
    List<company> addCompany(company companies);
}
