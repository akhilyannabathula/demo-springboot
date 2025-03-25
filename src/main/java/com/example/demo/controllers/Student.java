package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestParam;

public class Student {

    private int id;
    private String name;
    private int age;
    private String dept;



    public Student(int id, String name, int age, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }
}
