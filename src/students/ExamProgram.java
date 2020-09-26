package students;


import java.util.HashMap;
import java.util.Map;

public class ExamProgram {
    public static void main(String[] args) {
        Subject subject = new Subject("Programming", 1000, true);
        Subject subject1 = new Subject("Art",500,false);
        Map<Subject,Double> subjectsForStudent1 = new HashMap<>();

        subjectsForStudent1.put(subject,60d);
        subjectsForStudent1.put(subject1,80d);

        Student student1 = new Student("John Doe",20,60,subject,subjectsForStudent1);
        Teacher teacher1 = new Teacher("Musk","Physics");

        teacher1.giveResults(80,student1);
        System.out.println(student1);

        Subject subjectFor2 = new Subject("Physiscs",2000,true);
        Subject subject2 = new Subject("Biology",2000,true);
        Map<Subject,Double> subjectsForStudent2 = new HashMap<>();
        subjectsForStudent1.put(subjectFor2,90d);
        subjectsForStudent1.put(subject2,70d);
        Student student2 = new Student("Steve Jobs",1,50,subject1,subjectsForStudent2);
        student2.takeExam(100);
        System.out.println(student2);

        teacher1.giveResults(100,student2);
        System.out.println(student2);




    }
}
