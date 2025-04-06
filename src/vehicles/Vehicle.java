public abstract class Vehicle {
    private final String licensePlate;
    private final VehicleType type;
    private String ownerName;
    private final String color;

    // Demonstrates: II. Overloaded Constructors
    public Vehicle(String licensePlate, VehicleType type) {
        if (licensePlate == null || licensePlate.trim().isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty.");
        }
        this.licensePlate = licensePlate.toUpperCase();
        this.type = type;


    public Vehicle(String licensePlate, VehicleType type, String ownerName) {
         this.licensePlate = licensePlate.toUpperCase();
        this.type = type;
        this.ownerName = ownerName;
    }

    public Vehicle(String licensePlate, VehicleType type, String ownerName, String color) {
        this.licensePlate = licensePlate.toUpperCase();
        this.type = type;
        this.ownerName = ownerName;
        this.color = color;

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

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
