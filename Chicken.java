public class Chicken extends Bird {

    public Chicken(String species, String gender, int age) {
        super(species, gender, age);
    }

    // overriding the fly method of Bird class
    public void fly() {
        System.out.println("not able to fly...");
    }

}