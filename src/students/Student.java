package students;


import java.util.Map;

public class Student {
    public String name;
    public int id;
    public double currentResult;
    public Subject subject;
    public Map<Subject, Double> subjectsMap;

    public Student(String name,int id,double currentResult,Subject subject,Map<Subject, Double>subjects) {
        this.name = name;
        this.id = id;
        this.currentResult = currentResult;
        this.subject = subject;
        this.subjectsMap = subjects;
    }


    public void takeExam(double result){
       currentResult = (currentResult + result)/2;

    }
   // public void takeExam(double score,Subject subject){
   //     subjects.put(subjects,score);


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", currentResult=" + currentResult +
                ", subject=" + subject +
                ", subjectsMap=" + subjectsMap +
                '}';
    }
}



