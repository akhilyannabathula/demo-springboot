package com.example.demo.Threads.locks;

public class Habi extends Thread{
    Car car;
    public Habi(Car car){
        this.car =car;
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
