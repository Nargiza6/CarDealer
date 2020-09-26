package dogs;

public class Dog {
   private String breed;
   private double mass;
   private Eye eye;
   public static String voice = "Bark Bark";
   public  static int count = 0;

    public Dog(String breed,double mass,Eye eye) {
        this.breed = breed;
        if (mass > 0) {
            this.mass = mass;
        }
        else{
            System.err.println("Invalid mass entered.Provide a positive value");
            System.exit(-1);
        }
        this.eye = eye;
        count++;

    }
    public Dog(String breed,double mass){
        this(breed,mass,new Eye("blue","asian",-2));
    }
    void  bark(){
        System.out.println(voice);
    }
    double changeEyeSight(double newEyeSight){
        eye.sight = newEyeSight;
        return eye.sight;
    }
    public void setMass(double mass){
        if (mass > 0){
            this.mass = mass;
        }
    }
    public double getMass(){
        return mass;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public int getCount() {
        return count;

    }
   // public static void makeSound(){
     //   System.out.println("Bark Bark");
       // System.out.println("My Dog weight is " + mass);
    //}cannot call intance var mass inside the static method;

}



