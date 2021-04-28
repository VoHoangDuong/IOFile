package com.thread;

public class TestThread3 extends Thread{
    public void run(){
        for (int i = 0; i < 8; i++) {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        TestThread3 tt1 = new TestThread3();
        tt1.setName("ABC1");

        TestThread3 tt2 = new TestThread3();
        tt2.setName("DEF2");

        TestThread3 tt3 = new TestThread3();
        tt3.setName("GHI3");

        tt1.setPriority(10);
        tt2.setPriority(5);
        tt3.setPriority(1);

//        tt1.start();
//        tt2.start();
//        tt3.start();

        // daemon thread

        tt1.setDaemon(true);
        System.out.println(tt1.isDaemon());

    }
}
