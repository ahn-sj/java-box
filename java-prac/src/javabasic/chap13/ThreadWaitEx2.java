package javabasic.chap13;

import java.util.ArrayList;
import java.util.List;

public class ThreadWaitEx2 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "요리사").start();
        new Thread(new Customer(table, "도넛"), "고객1").start();
        new Thread(new Customer(table, "버거"), "고객2").start();

        Thread.sleep(100);
        System.exit(0);
    }
}

class Cook2 implements Runnable {

    private Table table;

    public Cook2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int index = (int) (Math.random() * table.dishSize());
            table.add(table.dishNames[index]);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Table2 {
    String[] dishNames = { "도넛", "도넛", "버거"};
    final int MAX_FOOD = 6;

    private List<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) { // 테이블에 음식이 6개 이상인 경우
            return;
        }
        dishes.add(dish);
        System.out.println("음식 = " + dishes.toString());
    }

    public boolean eat(String food) {
        synchronized (this) {
            while (dishes.size() == 0) {
                String threadName = Thread.currentThread().getName();
                System.out.println("threadName = " + threadName);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < dishes.size(); i++) {
                if(food.equals(dishes.get(i))) {
                    dishes.remove(i);
                    // 음식을 먹은 경우
                    return true;
                }
            }
        }
        return false;
    }

    public int dishSize() {
        return dishNames.length;
    }

}

class Customer2 implements Runnable {

    private Table table;
    private String food;

    public Customer2(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String threadName = Thread.currentThread().getName();

            if(eatFood()) {
                System.out.println(threadName + ": 먹고싶은 음식을 먹었습니다. " + food);
            } else {
                System.out.println(threadName + ": 먹고싶은 음식이 없습니다." + food);
            }
        }

    }

    private boolean eatFood() {
        return table.eat(food);
    }
}