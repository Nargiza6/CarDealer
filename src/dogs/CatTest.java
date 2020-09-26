package dogs;

import java.util.concurrent.Callable;

public class CatTest {
    public static void main(String[] args) {

        System.out.println(Cat.count);
        Cat.count = 2;
        System.out.println(Cat.count);

        Cat.count++;
        System.out.println("Accessed count bc it is public,so I can modify to value " + Cat.count);

        Cat catReference = new Cat();
        System.out.println("After calling the constructor which has count++ " + Cat.count);

        System.out.println(Cat.count);

        System.out.println("Reference cat " + catReference.count);
        Cat cat1 = new Cat();
        System.out.println("count after creating cat1 " + Cat.count);

        System.out.println("Cat count " + catReference.count);
        System.out.println(Cat.count);
        System.out.println(cat1.count);

        cat1.count++;

        System.out.println(catReference.count);

        Cat cat2 = new Cat();

        System.out.println(cat1.count);
        System.out.println("Cat2 " + cat2.instanceCount);

        System.out.println(cat2.instanceCount);

        cat2.instanceCount = 1002;
        System.out.println(cat2.instanceCount);
        System.out.println(cat1.instanceCount);





            }
        }


