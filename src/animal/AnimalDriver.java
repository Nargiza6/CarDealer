package animal;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal lion = new Predator("Lion");
        System.out.println(lion);
        lion.eat();
        lion.printName();

        Predator lion1 = new Predator("Lion King");

        lion1.eat();
        Animal lion2 = lion1;
        Predator lion3 = (Predator) lion2;
        Animal parrot = new Birds("Kesha");
        parrot.getAnimalType(parrot);

        Animal parrot2 = parrot.getAnimalType(parrot);
        ((Birds)parrot2).fly();


    }
}
