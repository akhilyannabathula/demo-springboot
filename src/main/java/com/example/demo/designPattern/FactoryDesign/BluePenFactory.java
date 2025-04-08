package com.example.demo.designPattern.FactoryDesign;

public class BluePenFactory {


    public BluePen createsBluePen(){
        BluePen bluePen= new BluePen("Blue Ink");
        return bluePen;
    }
}
