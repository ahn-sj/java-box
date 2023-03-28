package factorypattern;

public class VehicleTest {
    public static void main(String[] args) {
        print(new BoatFactory());
        System.out.println("===========");
        print(new CarFactory());
    }

    private static void print(Factory factory) {
        Vehicle vehicle = factory.orderVehicle();
        factory.validateVehicle(vehicle);

        System.out.println("[" + vehicle.getProducer() + "]에서 만든 [" + vehicle.getName() +
                "]는(은) " + vehicle.ring() + " 잘 동작한다.");
    }
}
