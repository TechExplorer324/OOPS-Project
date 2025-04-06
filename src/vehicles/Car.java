// public class Car extends Vehicles{

//     String color;
//     String CarCompany;



//     public Car(String Type, String VehicleNo, String color, String carCompany){
//         super(Type, VehicleNo);
//         this.color = color;
//         this.carCompany = carCompany;

//     }

//     public String getColor(){
//         return color;
//     }

//     public String getCarCompany(){
//         return carCompany;
//     }

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
     public Car(String licensePlate, String ownerName) {
        super(licensePlate, VehicleType.CAR, ownerName);
    }

    @Override
    public double getRequiredSpotSize() {
        return 1.0; // Standard car size unit
    }
}

    
// }
