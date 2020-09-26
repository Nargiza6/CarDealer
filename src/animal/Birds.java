package animal;

public class Birds  implements Animal{
   private String name;

    public Birds(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I ate");

    }

    @Override
    public void printName() {
        System.out.println(name);

    }

    @Override
    public Animal getAnimalType(Animal animal) {
        return new Birds("Parrot");
    }
    public void fly(){
        System.out.println("I believe I can fly");
    }
}

