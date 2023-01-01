package headfirst.designpatternjava.intro.duck.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓만큼 빠르다!");
    }
}
