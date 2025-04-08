package com.example.demo.designPattern.FactoryDesign;

public class BluePen {

    String ink;
    String cap;

    public BluePen(String ink){
        this.ink = ink;
        System.out.println("constructing blue pen");
    }

    public void writes(){
        System.out.println("writes in blue colour");
    }
}
