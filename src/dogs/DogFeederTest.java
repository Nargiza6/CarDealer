package dogs;
import static dogs.DogFeeder.feedTheDog;

public class DogFeederTest {
    public static void main(String[] args) {

        Eye labEye = new Eye("Blue","Big",2.1);
        Dog labrador = new Dog("Labrador",20,labEye);
        System.out.println("Mass in the beginnig: " + labrador.getMass());

        DogFeeder.feedTheDog(labrador,15);
        System.out.println("New weight:" +labrador.getMass());

        DogFeeder someGuy = new DogFeeder();
        someGuy.feedTheDog(labrador,3);
        System.out.println(labrador.getMass());

        feedTheDog(labrador,5);
        System.out.println("new weight " + labrador.getMass());

        String string = "John Doe";


    }
}
