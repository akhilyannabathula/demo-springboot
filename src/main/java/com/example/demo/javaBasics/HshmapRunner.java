package com.example.demo.javaBasics;

import com.example.demo.controllers.Student;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HshmapRunner {

    public static void main(String[] args) throws SQLException {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"zxc",25,"CSE"));
        list.add(new Student(2,"abc",26,"ECE"));
        list.add(new Student(3,"qwe",27,"CSE"));
        list.add(new Student(4,"poi",28,"CSE"));
        list.add(new Student(5,"mnb",25,"ECE"));
        list.add(new Student(6,"qwe",25,"CSE"));

        Map<String,List<Student>> nameStudentMap= new HashMap<>();
        System.out.println(nameStudentMap);

        for(int i=0; i<list.size(); i++) {
            Student currentStudent = list.get(i); //first get the current student
            String dept = currentStudent.getDept(); // get the branch of current dept
            List<Student> stuList = nameStudentMap.getOrDefault(dept, new ArrayList<Student>()); //get the list of all students who already present in this dept
            stuList.add(currentStudent); // add current student to existing student
            nameStudentMap.put(dept, stuList); // update the map
            //System.out.println(stuList);
        }
        System.out.println(nameStudentMap);

         // group by age
        Map<Integer,List<Student>> ageFilterMap = new HashMap();
        System.out.println(ageFilterMap);

        for(int i=0;i<list.size();i++){
            Student currStudent = list.get(i);
            Integer currStudentAge = currStudent.getAge();
            List<Student> ageList= ageFilterMap.getOrDefault(currStudentAge, new ArrayList<Student>());
            ageList.add(currStudent);
            ageFilterMap.put(currStudentAge,ageList);
        }
        System.out.println(ageFilterMap);

//        //using java 8
        System.out.println(list.stream().collect(Collectors.groupingBy(student -> student.getAge())));
        Map<String, List<Student>> deptMap =list.stream().collect(Collectors.groupingBy( Student::getDept ));
        System.out.println(deptMap);

        //list.forEach(System.out::println); both are same list.forEach(student -> System.out.println(student));

        List<Integer> numbers = Arrays.asList(1,2,3,1,2,3,4,5,6,5,6);
        System.out.println(numbers.stream().filter(number ->number>2).distinct().collect(Collectors.toList()));

        //optional on deptlist
        System.out.println(deptMap);

        List<Student> students =  deptMap.get("EEE");
        System.out.println(students);



        Optional<List<Student>> studentsOpt =  Optional.ofNullable(deptMap.get("EEE"));
        System.out.println(studentsOpt.orElse(new ArrayList<>()));

        Connection con = null;


        //try without resources traditional way
        try {
            con= DriverManager.getConnection("", "", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close();
        }


        //try with resources
        try (Connection conn = DriverManager.getConnection("", "", "")){

        }
        finally {
            //no need to do anything cuz try with resources will automatically call conn.close();
        }


    }
}
