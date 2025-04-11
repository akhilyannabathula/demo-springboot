package com.example.demo.Threads.locks;

public class Akhil extends Thread{

    Car car;

    public Akhil(Car car){
        this.car = car;
    }

    @Override
    public void run(){
        car.enter();
        try {
            car.drive();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
