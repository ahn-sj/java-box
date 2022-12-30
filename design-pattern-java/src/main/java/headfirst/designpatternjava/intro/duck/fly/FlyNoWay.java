package headfirst.designpatternjava.intro.duck.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("못 난다!");
    }
}
