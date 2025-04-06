public class EVChargingCost {

    int base_price_car = 50;
    int base_price_twowheeler = 25;
    int carPerVoltCost = 10;
    int twoWheelerPerVoltCost = 5;
    int price = 0;
    int percentage;

    public EVChargingCost(int percentage) {
        this.percentage = percentage;
    }

    public int getChargingCost(Vehicles vehicleType){

        if(vehicleType == CAR){
            price += base_price_car;
            price += carPerVoltCost*(100-percentage);
        }
        else{
            price += base_price_twowheeler;
            price += twoWheelerPerVoltCost*(100-percentage);
        }
        return price;
    }

}

