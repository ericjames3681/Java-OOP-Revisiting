public class Fish extends Animal {

    public Fish(String species, String gender, int age) {
        super(species, gender, age);

    }

    public void swim() {
        System.out.println("swimming...");
    }

    public void move() {
        System.out.println("Fish is swimming...");
    }

}