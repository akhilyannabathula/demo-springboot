package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class AnnotatsController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name){
        //FOR OPTIONAL - public String sayHelllo(@RequestParam(name="name" , required=false, defaultValue="guest") String name)
        return "Hello" + name;
    }

    @GetMapping("/numbers/{id}/name/{name}")
    public String userId(@PathVariable int id, @PathVariable String name){
        return "num=" + id + "Name=" + name;
    }


    @PostMapping("/save-student")
    public String multiple(@RequestBody Student student){
        System.out.println("student is" + student);
        return student.getName();
    }
}
