package com.example.demo.Threads.producerconsumer;

public class Producer extends Thread{
    private SharedQueue sharedQueue;
    public Producer(SharedQueue sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run(){
        for (int i=0;i<100;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            sharedQueue.produce(i);
        }
    }

}
