package headfirst.designpatternjava.intro.duck;

import headfirst.designpatternjava.intro.duck.fly.FlyNoWay;
import headfirst.designpatternjava.intro.duck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("난 모형 오리!");
    }
}
