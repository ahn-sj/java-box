package factorypattern;

public abstract class Vehicle {
    private String producer;
    private String name;

    abstract String ring();

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public void setFields(String producer, String name) {
        this.producer = producer;
        this.name = name;
    }
}

class Car extends Vehicle {
    public Car(String producer) {
        this.setFields(producer, "자동차");
    }

    @Override
    public String ring() {
        return "CarCar!";
    }
}

class Boat extends Vehicle {
    public Boat(String producer) {
        this.setFields(producer, "보트");
    }

    @Override
    public String ring() {
        return "BoatBoat!";
    }
}
class Bicycle extends Vehicle {
    public Bicycle(String producer) {
        this.setFields(producer, "자전거");
    }

    @Override
    public String ring() {
        return "BicycleBicycle!";
    }
}