package com.thread;

public class TestThread4 implements Runnable{
    public int amount;

    public TestThread4(){
        this.amount = 200;
    }

    public synchronized void rutTien(){
        if (amount > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            amount = amount - 200;
            System.out.println(amount);
        }else {
            System.out.println("khong du tien");
        }
    }

    public  void run() {
        try {
            rutTien();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();

        Thread tt1 = new Thread(testThread4);
        Thread tt2 = new Thread(testThread4);

        tt1.start();
        tt2.start();

    }
}
