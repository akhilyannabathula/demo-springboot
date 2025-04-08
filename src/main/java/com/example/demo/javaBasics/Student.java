package com.example.demo.javaBasics;

import java.io.Closeable;

public class Student implements Comparable<Student>, Closeable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student student2 = (Student) obj;
        if(this.name == student2.name) return true;
        else return false;
    }

    @Override
    public int compareTo(Student student2){

        if(this.id > student2.id) return 1;
        else if(this.id < student2.id) return -1;
        else return 0;

        //same as above
        //return this.id - student2.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                '}';
    }

    @Override
    public void close(){
       //write code to close;
        System.out.println("closing method called");
    }
}
