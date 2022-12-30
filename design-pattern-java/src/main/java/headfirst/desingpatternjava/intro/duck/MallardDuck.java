package headfirst.desingpatternjava.intro.duck;

import headfirst.desingpatternjava.intro.duck.fly.FlyWithWings;
import headfirst.desingpatternjava.intro.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // Duck 클래스의 인스턴스 변수를 상속받음
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 물오리!");
    }
}
