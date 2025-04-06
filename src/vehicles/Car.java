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

public class Car extends Vehicles{

    String carCompany;
    String carType;
    int noOfPassengers;
    


    public Car(String licensePlate, VehicleType type){
        super(licensePlate, type);
        }

   public Vehicle(String licensePlate, VehicleType type, String ownerName) {
         super(licensePlate, type, ownerName);
    }

    public Vehicle(String licensePlate, VehicleType type, String ownerName, String color) {
       super(licensePlate, type, ownerName, color);

        }

    public String getCarCompany(){
        return CarCompany;
    }

     public String getCarType(){
        return CarType;
    }

    public String getNoOfPassengers(){
        return noOfPassengers;
    }

    public void setCarCompany(String carCompany){
        this.carCompany = carCompany;
    }

    public void setNoOfPassengers(int Passengers){
        this.noOfPassengers = Passengers;
    }

    public void setCarType(String carType){
        this.carType = carType;
    }


    



    
}


    
// }
