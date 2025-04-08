package com.example.demo.designPattern.FactoryDesign;

public class BlueJelPenFactory {

    public BlueJelInkPen createsBlueJelInkPen(){
        BlueJelInkPen blueJelInkPen= new BlueJelInkPen("Blue Jel");
        return blueJelInkPen;
    }
}
