public class Zoo {
    public static void main(String args[]) {
        Animal animal1 = new Animal("Lion", "Male", 4);
        Animal animal2 = new Animal("Polar Bear", "Male", 10);

        animal1.details();
        animal2.details();
        Bird bird1 = new Bird("Flamingo", "Male", 2);
        bird1.details();
        Fish fish1 = new Fish("Salmon", "Male", 4);
        fish1.swim();
        Sparrow sp1 = new Sparrow("Sparrow", "Female", 1);
        sp1.details();

        sp1.fly();
    }
}