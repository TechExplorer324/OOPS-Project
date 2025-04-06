public class Car extends Vehicles{

    String color;
    String CarCompany;



    public Car(String Type, String VehicleNo, String color, String carCompany){
        super(Type, VehicleNo);
        this.color = color;
        this.carCompany = carCompany;

    }

    public String getColor(){
        return color;
    }

    public String getCarCompany(){
        return carCompany;
    }



    
}
