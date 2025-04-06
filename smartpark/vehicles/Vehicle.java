package vehicles;

public abstract class Vehicle {
    private final String licensePlate;
    private final VehicleType type;
    private final String color;
    private String ownerName;

    // Demonstrates: II. Overloaded Constructors
    public Vehicle(String licensePlate, VehicleType type, String color) {
        if (licensePlate == null) {
            throw new IllegalArgumentException("License plate cannot be null or empty.");
        }
        this.licensePlate = licensePlate.toUpperCase();
        this.type = type;
        this.color = color;

    }

    public Vehicle(String licensePlate, VehicleType type, String color, String ownerName) {

        if (licensePlate == null) {
            throw new IllegalArgumentException("License plate cannot be null or empty.");
        }
        this.licensePlate = licensePlate.toUpperCase();
        this.type = type;
        this.color = color;
        this.ownerName = ownerName;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


}