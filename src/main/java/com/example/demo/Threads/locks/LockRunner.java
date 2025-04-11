package com.example.demo.Threads.locks;

public class LockRunner {
    public static void main(String[] args) {
        Car car = new Car();
        Akhil akhil = new Akhil(car);
        akhil.setName("akhil thread");


        Habi habi = new Habi(car);
        habi.setName("habi thread");

        akhil.start();
        habi.start();

    }
}
