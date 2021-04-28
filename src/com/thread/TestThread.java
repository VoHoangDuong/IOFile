package com.thread;

public class TestThread extends Thread{
    private String threadName;

    public TestThread(String threadName) {
        super();
        this.threadName = threadName;
    }

    public void setThreadName(String name){
        this.threadName = name;
    }

    public String getThreadName(){
        return threadName;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getThreadName()+" " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("DUONG");
        TestThread t2 = new TestThread("DEP TRAI");
//        t1.setPriority(10);
//        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
