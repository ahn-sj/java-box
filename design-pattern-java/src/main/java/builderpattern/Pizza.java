package builderpattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    private final Set<Topping> toppings;

    public Pizza(Builder builder) {
        this.toppings = builder.toppings.clone();
    }

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addToppings(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));

            return self();
        }

        protected abstract T self();

        abstract CombinationPizza build();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }
}

class CombinationPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }

    final Size size;

    public CombinationPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        protected CombinationPizza build() {
            return new CombinationPizza(this);
        }
    }

    @Override
    public Set<Topping> getToppings() {
        return super.getToppings();
    }

    @Override
    public String toString() {
        return "CombinationPizza {" +
                "size=" + size +
                ", topping=" + getToppings() +
                '}';
    }
}

