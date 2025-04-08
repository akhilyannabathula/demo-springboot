package com.example.demo.javaBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EqualsCompareToCloseRunner {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Akhil");
        Student student2 = new Student(2,"Akhil");

        //now comparing two students, since we override equals method in Student class both of the above objects are equal
        System.out.println(student1.equals(student2)); // this will print true as we only compare name in equals method


        //now sorting, we are sorting using id by overriding compareTo method
        List<Student> students = Arrays.asList(student2,student1);
        System.out.println(students);
        Collections.sort(students);
        System.out.println("after sorting");
        System.out.println(students);


        //try with resources, this will automatically close the resource, i.e this will call close() once try is executed
        try (Student student = new Student(1,"")) {
        }

    }
}
