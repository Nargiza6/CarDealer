package students;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name,String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void giveResults(double result,Student student){
        student.takeExam(result);

    }

}
