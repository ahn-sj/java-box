package headfirst.designpatternjava.intro.duck.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("난다!");
    }
}
