package com.example.demo.designPattern.FactoryDesign;

public class RedPen {

    String ink;
    String cap;

    public RedPen(String cap){
        this.cap=cap;
    }


    public void writes(){
        System.out.println("writes in red colour");
    }
}
