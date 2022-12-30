package headfirst.desingpatternjava.intro.duck.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("==== mute ====");
    }
}
