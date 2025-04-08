package com.example.demo.designPattern.FactoryDesign;

public class RedPenFactory {

    public RedPen createRedPen(){
        RedPen redPen = new RedPen("Redcap");
        return redPen;
    }
}
