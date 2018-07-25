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


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<employee> employeeList) {
        this.employeeList = employeeList;
    }
}
