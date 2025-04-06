public class TwoWheeler extends Vehicle {

    /**
     * Constructor for creating a TwoWheeler with only a license plate.
     * Calls the superclass constructor to set the license plate and type.
     * Assumes a new VehicleType.TWO_WHEELER has been added to the enum.
     * @param licensePlate The license plate of the two-wheeler.
     */
    public TwoWheeler(String licensePlate) {
        // Call the superclass constructor, setting the type to TWO_WHEELER
        // This requires VehicleType.TWO_WHEELER to be added to the VehicleType enum
        super(licensePlate, VehicleType.TWO_WHEELER);
    }

    /**
     * Overloaded constructor for creating a TwoWheeler with license plate and owner name.
     * Calls the corresponding superclass constructor.
     * @param licensePlate The license plate of the two-wheeler.
     * @param ownerName The name of the two-wheeler's owner.
     */
     public TwoWheeler(String licensePlate, String ownerName) {
        // Call the superclass constructor, setting the type to TWO_WHEELER and owner name
        super(licensePlate, VehicleType.TWO_WHEELER, ownerName);
    }

    /**
     * Implements the abstract method from the Vehicle class.
     * Defines the relative size requirement for parking a two-wheeler.
     * @return The size unit required for a two-wheeler spot (e.g., 0.5 like a bike).
     */
    @Override
    public double getRequiredSpotSize() {
        // Two-wheelers typically require smaller spots, similar to bikes
        return 0.5; // Example: Represents a smaller size unit
    }

    /**
     * Provides a string representation of the TwoWheeler object.
     * Inherits the base implementation from Vehicle.
     * @return A string describing the two-wheeler (e.g., "TWO_WHEELER [AB01CD2345]").
     */
    @Override
    public String toString() {
        // Uses the superclass implementation which includes type and license plate
        return super.toString();
    }
}
