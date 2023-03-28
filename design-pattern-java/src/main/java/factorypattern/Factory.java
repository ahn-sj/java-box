package factorypattern;

public abstract class Factory {
    public final Vehicle orderVehicle() {
        // validateType(type);
        return createVehicle();
    }

//    private void validateType(String type) {
//        for (VehicleType value : VehicleType.values()) {
//            if(type.equalsIgnoreCase(value.name())) {
//                System.out.println("[" + type + "] 을 만듭니다.");
//                return;
//            }
//        }
//        throw new IllegalArgumentException("[" + type + "] 은 만들지 못합니다.");
//    }

    abstract Vehicle createVehicle();
    abstract void validateVehicle(Vehicle vehicle);
}

class BoatFactory extends Factory {
    private String producer = this.getClass().getSimpleName();

    @Override
    protected Vehicle createVehicle() {
        return new Boat(producer);
    }

    @Override
    void validateVehicle(Vehicle vehicle) {
        String producer = vehicle.getProducer();
        String ring = vehicle.ring();
        String name = vehicle.getName();

        if(producer == null || ring == null || name == null) {
            throw new IllegalArgumentException();
        }
    }
}

class CarFactory extends Factory {
    private String producer = this.getClass().getSimpleName();

    @Override
    Vehicle createVehicle() {
        return new Car(producer);
    }

    @Override
    void validateVehicle(Vehicle vehicle) {
        String producer = vehicle.getProducer();
        String ring = vehicle.ring();
        String name = vehicle.getName();

        if(producer == null || ring == null || name == null) {
            throw new IllegalArgumentException();
        }
    }
}
