package com.thread;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{ Thread.sleep(500);
            System.out.println("DUONG" + i);
        }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
