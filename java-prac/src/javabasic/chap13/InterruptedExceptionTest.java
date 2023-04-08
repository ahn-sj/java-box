package javabasic.chap13;

public class InterruptedExceptionTest {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThread3());

        th1.start();
        th1.interrupt();
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().isInterrupted());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("InterruptedException: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}