public class Phone {

    // Instance variables

    // Constructors

    // Methods
    String phoneBrand;
    int cost;
    boolean camera;
    String carrier;

    public Phone(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public Phone(String phoneBrand, int cost) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
    }

    public Phone(String phoneBrand, int cost, String carrier) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
        this.carrier = carrier;

    }


    public Phone(String phoneBrand, int cost, boolean camera, String carrier) {
        this.phoneBrand = phoneBrand;
        this.cost = cost;
        this.camera = camera;
        this.carrier = carrier;
    }
    public  boolean FindCheaperPhone(Phone phone1, Phone phone2){
        if ( Phone phone1 >= Phone phone2 && Phone phone1 <= Phone phone2){
            return true;
        }
        else{
            return false;
        }
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public int getCost() {
        return cost;
    }

    public boolean isCamera() {
        return camera;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneDetails(Phone phone){
      Phone phones1 = new Phone("Iphone,  1000, true, Verizon");
      Phone phones2 = new Phone("Samsung,  1200, false, AT&T");
    }

}
