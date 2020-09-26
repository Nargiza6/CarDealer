package dogs;

public class Cat {
    public static int count = 0;

    public int instanceCount = 0;

    public Cat(){
        count++;
    }
    public void makeSound(){
        System.out.println("meoow");
        System.out.println(count);
    }


}
