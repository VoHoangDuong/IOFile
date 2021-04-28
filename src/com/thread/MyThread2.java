package com.thread;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            try { Thread.sleep(500);
                System.out.println("Codegym" + i);
            } catch (Exception e) {

            }
        }
    }
}
