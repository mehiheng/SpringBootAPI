package com.example.crud;

public class employee {
    int id;
    String name;
    int age;
    String gender;

    public employee(int i, String a, int b, String v) {
        this.id=i;
        this.name=a;
        this.age=b;
        this.gender=v;
    }
    public employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
