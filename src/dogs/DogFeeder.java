package dogs;

public class DogFeeder {
    DogFeeder(){

    }
    public static void feedTheDog(Dog dog,int amount){

        System.out.println("about to feed your dog with " + amount + "kilo of goods");
        dog.setMass(dog.getMass() + amount); //helper method(all static method it is helper)


    }
}
