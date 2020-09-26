package animal;

public class Predator implements Animal {
    private String name;



    public Predator(String name) {
        this.name = name;
    }
    public void roar(){
        System.out.println("Rrrraar");
    }


    @Override
    public void eat() {
        System.out.println("I am full");

    }

    @Override
    public void printName() {
        System.out.println(name);

    }

    @Override
    public Animal getAnimalType(Animal animal) {
        return animal;
    }
}
