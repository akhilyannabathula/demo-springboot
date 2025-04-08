package com.example.demo.designPattern.FactoryDesign;

public class FactoryDesignPatternRunner {

    public static void main(String[] args) {

        //we created red pen Factory to create and return us pen
        RedPenFactory redPenFactory = new RedPenFactory();
        RedPen redPen = redPenFactory.createRedPen();
        redPen.writes();;


        //we created blue pen Factory to create and return us pen
        BluePenFactory bluePenFactory= new BluePenFactory();
        BluePen bluePen=bluePenFactory.createsBluePen();
        bluePen.writes();


    }
}
