package com.example.demo.designPattern.FactoryDesign;

public class BlueJelInkPen extends BluePen{

    public BlueJelInkPen(String ink){
        super(ink);
        System.out.println("constructing a blue jel ink pen");
    }

    @Override
    public void writes(){
        System.out.println("writes in blue Jel colour");
    }

}
