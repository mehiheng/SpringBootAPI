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
    public List<employee> add(employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    @Override
    public List<employee> findAll() {
        return employeeList;
    }

    @Override
    public List<employee> getById(String id) {
        List<employee> employeeGenderList=new ArrayList<>();
        if(isDigit(id)){
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).id==Integer.valueOf(id)){
                    employeeGenderList.add(employeeList.get(i));
                }
            }
        }else{
            if(id.matches("male")){
                for(int i=0;i<employeeList.size();i++){
                    if(employeeList.get(i).gender=="男"){
                        employeeGenderList.add(employeeList.get(i));
                    }
                }
            }else if(id.matches("female")){
                for(int i=0;i<employeeList.size();i++){
                    if(employeeList.get(i).gender=="女"){
                        employeeGenderList.add(employeeList.get(i));
                    }
                }
            }
        }
        return employeeGenderList;
    }
    public boolean isDigit(String strNum) {
        return strNum.matches("[0-9]{1,}");
    }


    @Override
    public List<employee> deleteById(int id) {
        String gender= String.valueOf(id);
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).id==id){
               employeeList.remove(i);
            }
        }
        return employeeList;
    }

    @Override
    public List<employee> updateEmployee(Integer id, employee employee) {
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).id==id){
                employeeList.set(i,employee);
            }
        }
        return employeeList;
    }

//    @Override
//    public List<employee> getByPage(int num, int page) {
//        return null;
//    }




}

