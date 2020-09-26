package dogs;

public class Eye {
    String color;
    String type;
    double sight;

    public Eye(String color,String type,double sight) {
        this.color = color;
        this.type = type;
        if (sight <= 3 && sight >= -3) {
            this.sight = sight;
        } else {
            System.err.println("Invalid eye sight provided");
            System.exit(-1);
        }
    }

    @Override
    public String toString() {
        return "Eye{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", sight=" + sight +
                '}';
    }
}
