public abstract class Animal {
    String species;
    String gender;
    int age;

    public Animal(String species, String gender, int age) {
        this.species = species;
        this.gender = gender;
        this.age = age;
    }

    public void details() {
        System.out.println("We have an " + age + " year old " + gender + " " + species + ".");
    }

    public void sleep() {
        System.out.println("Our " + species + " is sleeping");
    }

    public void eat() {
        System.out.println("Our " + species + " is eating");
    }

    public abstract void move();

}