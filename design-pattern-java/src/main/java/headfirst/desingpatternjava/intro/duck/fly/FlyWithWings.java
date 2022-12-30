package headfirst.desingpatternjava.intro.duck.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("난다!");
    }
}
