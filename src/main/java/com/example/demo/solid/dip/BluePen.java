package com.example.demo.solid.dip;

public class BluePen {
    Cap cap;
    String ink;

    public BluePen(Cap cap){
        this.cap = cap;
    }

    public void writes(){
        System.out.println("writing in blue ink");
    }

}
