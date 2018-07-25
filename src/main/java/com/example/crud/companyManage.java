package com.example.crud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("companyService")
public class companyManage implements companyService {
    static List<company> companyList=new ArrayList<>();
    static {
        companyList = set();
    }

    public static List<company> set(){
        List<employee> employeeList = new ArrayList<employee>();
        employeeList.add(new employee(1, "小红", 19, "女"));
        employeeList.add(new employee(2, "小智", 15, "男"));
        employeeList.add(new employee(3, "小霞", 15, "女"));
        company a = new company("alibaba", 3,employeeList);
        companyList.add(a);
        return companyList;
    }





    //公司列表
    @Override
    public List<String> findAll() {
        List<String> nameList=new ArrayList<>();
        for(int i=0;i<companyList.size();i++){
            nameList.add(companyList.get(i).companyName);
        }
        return nameList;
    }
    //查询具体公司
    @Override
    public company findCompany(int i) {
        return companyList.get(i-1);
    }
}
