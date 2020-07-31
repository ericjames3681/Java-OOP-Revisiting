public class Sparrow extends Bird implements Flyable {

    public Sparrow(String species, String gender, int age) {
        super(species, gender, age);
    }

    public void fly() {
        System.out.println("Sparrow flying high...");
    };

}