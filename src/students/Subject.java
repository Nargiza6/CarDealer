package students;

public class Subject {
    public String name;
    public int difficulty;
    public boolean scienceOrNot;

    public Subject(String name,int difficulty,boolean scienceOrNot) {
        this.name = name;
        this.difficulty = difficulty;
        this.scienceOrNot = scienceOrNot;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", scienceOrNot=" + scienceOrNot +
                '}';
    }
}
