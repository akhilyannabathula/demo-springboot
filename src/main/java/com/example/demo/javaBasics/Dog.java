package com.example.demo.javaBasics;

import org.springframework.web.bind.annotation.PostMapping;

public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("dog barks");
    }
}
