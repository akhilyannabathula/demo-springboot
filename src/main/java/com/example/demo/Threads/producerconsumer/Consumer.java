package com.example.demo.Threads.producerconsumer;

public class Consumer extends Thread{
    SharedQueue sharedQueue;
    public Consumer(SharedQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            sharedQueue.consume();
        }
    }
}
