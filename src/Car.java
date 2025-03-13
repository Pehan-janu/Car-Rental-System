public class Car {
    private String carId;
    private String Model;
    private String Brand;
    private double basedPricePerDay;
    private boolean isAvailable;

    //creating constructor for car class
    public car(String carId, String Model, String Brand, double basedPricePerDay,boolean isAvailabe){
        this.carId = carId;
        this.Model = Model;
        this.Brand = Brand;
        this.basedPricePerDay = basedPricePerDay;
        this.isAvailable = isAvailabe;
    }

    public String getCarId(){
        return carId;
    }

    public String getModel(){
        return Model;
    }

    public String getBrand(){
        return Brand;
    }

    public double calculatePrice(int rentalDays){
        return basedPricePerDay*rentalDays;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rentCar(){
        isAvailable = false;
    }

    public void returnCar(){
        isAvailable = true;
    }

}

