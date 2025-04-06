package vehicles;

public class Car extends Vehicle {
    String carCompany;
    String carType;
    int noOfPassengers;


    public Car (String licensePlate, String color, CarType type, String carCompany, String carType, int noOfPassengers) {
        super(licensePlate, VehicleType.CAR, color);
        this.carCompany = carCompany;
        this.carType = carType;
        this.noOfPassengers = noOfPassengers;
    }

    public Car (String licensePlate, VehicleType type, String color, String ownerName, String carCompany, String carType, int noOfPassengers) {
        super(licensePlate, VehicleType.CAR, color, ownerName);
        this.carCompany = carCompany;
        this.carType = carType;
        this.noOfPassengers = noOfPassengers;
    }


    public String getCarCompany() {
        return carCompany;
    }

    public String getCarType() {
        return carType;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public void setNoOfPassengers(int Passengers) {
        this.noOfPassengers = Passengers;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


}


