package com.example.demo.Threads;

public class ThreadCreationRunner {
    public static void main(String[] args) {
        //Creation of thread using Thread class
        System.out.println(Thread.currentThread() + "starts");
        SimpleThread simpleThread= new SimpleThread();
        simpleThread.setName("simpleThread");
        simpleThread.setDaemon(true);
        simpleThread.start();
        System.out.println(Thread.currentThread() + " ends");

        //Creation of thread using Implements Runnable Interface

        RunnableThread runnableThread= new RunnableThread();
        Thread thread= new Thread(runnableThread);
        thread.start();
    }
}
