package beans;


public class Cars {
    public String make;
    public String model;
    public int year;
    public double mileage;
    public double price;
    public String color;  //all this instance variables;
    public final String objectType = "Car";
    public final  double PRICE_DROP_RATE = 0.1;

    public Cars(String make, String carsModel, int Year, double mileage, double carsPrice, String carColor) {
        System.out.println("Car constructor is called");
        this.make = make;//have to use this keyword to explicitly tell to use instance variable make
        model = carsModel;
        this.year = year;
        this.mileage = mileage;
        this.price = carsPrice;//variable names do not have to be the same to able to use this keyword.
        color = carColor;
        System.out.println("Car Constructor is done and about to exit");
    }

    public Cars(String make, String carsModel, double carsPrice, String carColor) {
        this(make, carsModel, 2020, 0, carsPrice, carColor);
        // this.make = make;
        //  model = carColor;
        //   this.price = carsPrice;
        //    color = carColor;
        //   year = 2020;

    }

    public Cars(String make, String model) {
        this(make, model, 0, null);
        //his.make = make;
        //this.model = model;
        // year = 2020;
    }

    public Cars(double color, String make) {

    }

    public Cars(String make, double price) {

    }

    public Cars(double make, double price) {

    }

    public void drive(int howManyMiles) {
        mileage += howManyMiles;
        price = (price - PRICE_DROP_RATE * howManyMiles);
    }

    public void paintMyCars(String paintColor) {
        color = paintColor;
    }

    public boolean isGoodDeal() {
        if (year > 2015 && price <=2000){
            return true;
        }
        else{
            return false;
        }
    }
   // public String toString(){
     //   return ("Cars make: " + make + " Model: " + model + " Year: " + year + " Mileage: " + mileage + " price: "
          //          + price + " Color: " + color);


    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", objectType='" + objectType + '\'' +
                '}';
    }
}





