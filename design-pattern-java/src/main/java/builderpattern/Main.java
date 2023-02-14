package builderpattern;

import static builderpattern.CombinationPizza.Size.*;
import static builderpattern.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder("0123456789123", 13, "북북")
                .setHeight(70).setWidth(40).build();

        System.out.println(book);

        CombinationPizza pizza = new CombinationPizza.Builder(SMALL)
                .addToppings(SAUSAGE).addToppings(ONION).build();

        System.out.println(pizza);
    }
}
