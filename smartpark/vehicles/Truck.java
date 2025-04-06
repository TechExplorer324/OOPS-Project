public class Truck extends Vehicle {
    public Truck(String licensePlate) {
        super(licensePlate, VehicleType.TRUCK);
    }
     public Truck(String licensePlate, String ownerName) {
        super(licensePlate, VehicleType.TRUCK, ownerName);
    }

    @Override
    public double getRequiredSpotSize() {
        return 2.0; // Larger size unit
    }
}
