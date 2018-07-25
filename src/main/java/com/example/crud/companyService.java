package com.example.crud;

import java.util.List;

interface companyService {
    List<String> findAll();
    company findCompany(int i);
}
