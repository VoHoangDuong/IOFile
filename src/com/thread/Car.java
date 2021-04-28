package com.thread;

import java.util.Random;

public class Car implements Runnable{
    private String name;

    public class Main{
        public static final int DISTANCE = 100;
        public static final int STEP = 5;
    }

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start
        int runDistance = 0;
        // Thời gian bắt đầu cuộc thi

        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < Main.DISTANCE){
            try{
                // Random Speed KM/H
                int speed = (new Random()).nextInt(20);
                // Calculate traveled distance
                runDistance += speed;
                // Build result graphic
                String log = "|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;

                for (int i = 0; i < Main.DISTANCE; i+=Main.STEP) {
                    if (percentTravel >= i + Main.STEP){
                        log+= "=";
                    }else if (percentTravel >= i && percentTravel < i + Main.STEP){
                        log += "o";
                    }else {
                        log += "-";
                    }
                }log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Car " + this.name + " broken.... ");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
