package driver;

import beans.Cars;
import beans.Garage;

import java.util.ArrayList;
import java.util.List;

public class CarsDealerProgram {
    public static void main(String[] args) {
        System.out.println("Main method stared");

        Cars cars1 = new Cars("BMW", "M6", 2020, 1203, 80000, "Black");

        System.out.println("cars make: " + cars1.make + " Model " + cars1.model);
        System.out.println("Main method ending");

        Cars mercedes = new Cars("Mercedes", "S600", 2019, 1234, 4500, "White");
        System.out.println("Cars2 make: " + mercedes.make + " Model " + mercedes.model);

        Cars audi = new Cars("Audi", "Q6", 2014, 23456, 2300, "Red");
        System.out.println("Cars3 make: " + audi.make + " Model: " + audi.model + " Year: " + audi.year + " Mileage: " + audi.mileage + " price: "
                + audi.price + " Color: " + audi.color);

        Cars lambo = new Cars("lamborgini", "Aventador", 5000000, "yellow");
        Cars range = new Cars("Lange Rover", "Range Rover", 200000, "blue");

        Cars kia = new Cars("Kia", "rio");

        System.out.println();
        List<Cars> carsList = new ArrayList<>();
        carsList.add(cars1);
        carsList.add(mercedes);
        carsList.add(audi);
        carsList.add(lambo);
        carsList.add(range);
        carsList.add(kia);

        for (Cars cars : carsList) {
            System.out.println("Cars make: " + cars.make + " Model: " + cars.model + " Year: " + cars.year + " Mileage: " + cars.mileage + " price: "
                    + cars.price + " Color: " + cars.color);

        }
        System.out.println("drive bmw for 2000 miles");
        System.out.println(cars1.mileage);
        cars1.mileage = 3203.0;
        System.out.println(cars1.mileage);
        //car1.objectType = "Not car"; final

        Garage garage = new Garage("Shell","Fosteren");


        System.out.println();
        mercedes.drive(1400);
        audi.drive(4000);
        lambo.paintMyCars("Green");
        for (Cars cars : carsList) {
          //  System.out.println("Cars make: " + cars.make + " Model: " + cars.model + " Year: " + cars.year + " Mileage: " + cars.mileage + " price: "
                 //   + cars.price + " Color: " + cars.color  + " object type " + cars.objectType);
            System.out.println(cars);
        }
        System.out.println("Is Audi a good deal? " + audi.isGoodDeal());
        System.out.println("Is Kia a good deal? " + kia.isGoodDeal());

        System.out.println(audi);

        System.out.println(carsList);

        System.out.println(garage.printCarsProperties(audi));
        System.out.println("Price for the car paint was: " + garage.paintCars(range,"white"));
        System.out.println(range);



    }
}