package javabasic.chap13;

public class RunnableImpl {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print("+");
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("-");
        }
    }
}
