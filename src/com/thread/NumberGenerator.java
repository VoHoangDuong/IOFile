package com.thread;

import java.util.Random;

public class NumberGenerator implements Runnable{

    Random generator = new Random();

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println( i + " " + "Random Integer "  + generator.nextInt() );
        }
    }

    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();

        Thread t1 = new Thread(ng);
        Thread t2 = new Thread(ng);

        t1.setPriority(10);
        t2.setPriority(5);

        t1.start();
        t2.start();
    }
}
