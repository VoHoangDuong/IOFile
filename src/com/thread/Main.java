package com.thread;

public class Main {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        //
        MyThread2 my2 = new MyThread2();
        MyThread2 my3 = new MyThread2();
//        t2.start();
        t2.start();
        t1.start();
        my2.start();
        my3.start();

    }
}
