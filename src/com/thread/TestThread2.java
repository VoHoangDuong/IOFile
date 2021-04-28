package com.thread;

public class TestThread2 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {

        TestThread2 t1 = new TestThread2();
        t1.setName("Duong");

        TestThread2 t2 = new TestThread2();
        t2.setName("Dep Trai");

        TestThread2 t3 = new TestThread2();
        t3.setName("****");

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);

//        t1.start();
//        t2.start();
//        t3.start();
//        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t2.start();
////        try {
////            t2.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        t3.start();
        t1.start();
        t2.start();
//        t1.setDaemon(true);
//        System.out.println(t1.isDaemon());
    }
}
