package dogs;

import java.util.concurrent.Callable;

public class CatTest2 {
    public static void main(String[] args) {
        System.out.println("Cat count:  " + Cat.count);
       // Cat.instanceCount; cannot be called unless object is created

        Cat kitten = new Cat();
        System.out.println(kitten.instanceCount);

        Cat garfield = new Cat();
        System.out.println(Cat.count);

        System.out.println(String.valueOf(2));

        String str1 = new String("John Doe");

    }
}