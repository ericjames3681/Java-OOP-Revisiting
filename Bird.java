public class Bird extends Animal {

    public Bird(String species, String gender, int age) {
        super(species, gender, age);
    }

    public void fly() {
        System.out.println("flying...");
    }

}