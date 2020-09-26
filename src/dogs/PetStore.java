package dogs;

public class PetStore {
    public static void main(String[] args) {
        Eye akitaEye = new Eye("Green","Asian",1);
        Dog akita = new Dog("Akita",20.05,akitaEye);

        System.out.println("Bree: " +akita.getBreed());
        System.out.println("Mass: " + akita.getMass());
        System.out.println("Eye color: " + akita.getEye().color);
        akita.bark();
        akita.changeEyeSight(2.0);
        System.out.println("New eye sight: " + akita.getEye().sight);

        System.out.println("eye info: " + akita.getEye());

        Eye labEye = new Eye("Blue","Big",2.1);
        Dog labrador = new Dog("Labrador",20,labEye);

        System.out.println("Labrador: " +labrador.getMass());
        //labrador.mass = -10;not it is privite.created a setter method to apply non negative
       // System.out.println("Labrador new mass: " + labrador.mass);not accesible
        System.out.println("Labrador new mass: " + labrador.getMass());

        System.out.println(Dog.voice);

        System.out.println(labrador.getCount());
        labrador = new Dog("labradorr",21,labEye);
        System.out.println(labrador.getCount());

        System.out.println(Dog.count);




    }
}
