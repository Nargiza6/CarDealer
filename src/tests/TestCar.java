package tests;

import beans.Cars;
import org.junit.Assert;
import org.junit.Test;
import students.Student;
import students.Subject;
import students.Teacher;

import java.util.HashMap;
import java.util.Map;

public class TestCar {
    @Test
    public void test(){
        System.out.println("Hello to me first Test");
    }

    @Test
    public void testString(){
        System.out.println("This is me second test".toUpperCase());
    }
    @Test
    public void testAssertions(){
        System.out.println("This is my third test");
        Assert.fail();//always is fails

    }
    @Test
    public void testAssertions2(){
        Assert.assertEquals(10,10);//first one is expected,second one is actual
    }
    public void testAssertions3(){
        Assert.assertTrue(false);//false will fail,true will pass
    }
    @Test
    public void testAssertions4(){
        Assert.assertEquals(10.2,9.7,0.4);//first one is expected,second one is actual
    }
    @Test
    public void testAssertions5(){
        Assert.assertEquals("Apple","Apple");
    }
    @Test
    public void testAssertions6(){
        Assert.assertEquals('C','C');
    }
    @Test
    public void testAssertions7(){
        Assert.assertEquals("Test failed on line 43",80,91);
        }

    @Test
    public void testStudent(){
        Subject subject = new Subject("Programming", 1000, true);
        Subject subject1 = new Subject("Art",500,false);
        Map<Subject,Double> subjectsForStudent1 = new HashMap<>();

        subjectsForStudent1.put(subject,60d);
        subjectsForStudent1.put(subject1,80d);

        Student student1 = new Student("John Doe",20,60,subject,subjectsForStudent1);
        Teacher teacher1 = new Teacher("Musk","Physics");

        teacher1.giveResults(80,student1);


        Assert.assertEquals("Student new result is invalid",70.0,student1.currentResult,0.0);
    }
    @Test
    public void carTest(){
        Cars bmw = new Cars("BMW", "M6", 2020, 1203, 80000, "Black");
        Assert.assertEquals("Make is not properly initialized","BMW",bmw.make);
        Assert.assertEquals("Model is not properly initialized","M6",bmw.model);
        Assert.assertEquals("Price is incorect",80000.0,bmw.price,0.0);
    }
    @Test
    public void carTest2(){
        Cars bmw = new Cars("BMW","M6",2020,1203,80000,"Black");
        bmw.drive(2000);
        Assert.assertEquals("Milede is invalid after driving the car for 2000 miles",3203.0,
                bmw.mileage,0.0);
        Assert.assertEquals("Price drop is invalid",79800.0,bmw.price,0.0);
    }

}






