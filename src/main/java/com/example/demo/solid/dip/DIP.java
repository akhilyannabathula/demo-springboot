package com.example.demo.solid.dip;

import com.example.demo.solid.dip.BluePen;

public class DIP {
    public static void main(String[] args) {
        BlueCap cap = new BlueCap("Blue");
        BluePen pen = new BluePen(cap);
        pen.writes();
    }
}
