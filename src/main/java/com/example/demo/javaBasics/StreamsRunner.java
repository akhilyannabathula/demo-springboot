package com.example.demo.javaBasics;

import com.example.demo.controllers.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsRunner {
    public static void main(String[] args) {

        List<Student> list= new ArrayList<Student>();

        list.add(new Student(1,"zxc",25,"CSE"));
        list.add(new Student(2,"abc",26,"ECE"));
        list.add(new Student(3,"qwe",27,"CSE"));
        list.add(new Student(4,"poi",28,"CSE"));
        list.add(new Student(5,"mnb",25,"ECE"));

//        for(Student student: list){
//            System.out.println(student);
//        }
        System.out.println(list);

        List<Student> filteredList = new ArrayList();
//        for(Student student1:list){
//            if(student1.getAge()>25){
//                filteredList.add(student1);
//            }
//        }
        Predicate<Student> ageFilter = (stu)-> stu.getAge()>25;

       list.stream().filter( (age) -> age.getAge()>25 ).toList();
       list.stream().filter((name) -> name.getName().contains("c")).toList();
        filteredList=list.stream().filter((student) -> student.getDept()=="ECE").toList();
        System.out.println(filteredList);


        System.out.println(list);

        List<Student> sortedList = new ArrayList<>();

        sortedList= list.stream().sorted( (student1,student2)-> student1.getAge() - student2.getAge()).collect(Collectors.toList());

        System.out.println(sortedList);

        List<Integer> intList = Arrays.asList(1,10,3,5,3,2);
        List<Integer> secLargest;

        secLargest= intList.stream().sorted((num1,num2) -> num2 - num1 ).collect(Collectors.toList());

        System.out.println(secLargest.get(1));

        System.out.println(list);





    }
}
