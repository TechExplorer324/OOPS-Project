package vehicles;

public class TwoWheeler extends Vehicle {

    public TwoWheeler(String licensePlate, VehicleType type, String color) {
        super(licensePlate, VehicleType.TWO_WHEELER, color);
    }
    public TwoWheeler(String licensePlate, VehicleType type, String color, String ownerName) {
        super(licensePlate, VehicleType.TWO_WHEELER, color, ownerName);
    }
}
