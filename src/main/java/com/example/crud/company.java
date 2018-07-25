package com.example.crud;

import java.util.List;

public class company {
    String companyName;
    int employeeNumber;
    List<employee> employeeList;

    public company(String a,int b,List<employee> c){
        this.companyName=a;
        this.employeeNumber=b;
        this.employeeList=c;
    }
    public company(){}






}
