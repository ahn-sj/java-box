package javabasic.chap13;

public class InheritedThread {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print("+");
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("-");
        }
    }
}