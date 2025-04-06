public class TwoWheeler extends Vehicles{

    String color;
    String Company;



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
