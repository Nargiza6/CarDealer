package beans;

public class Garage {
    public String name;
    public String address;

    public Garage(String name,String address){
        this.name = name;
        this.address = address;
    }
    public int paintCars(Cars cars,String color){
        if (cars.make.equalsIgnoreCase("Lamborgini")){
            cars.paintMyCars(color);
            return 2000;
        }
        else{
            cars.paintMyCars(color);
            return 200;
        }
    }

    public String printCarsProperties(Cars cars) {
      return cars.toString();
    }
}