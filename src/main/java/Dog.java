public class Dog {
    private String name;
    private  String breed;

    public Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public static void displayDog(Dog dog) {
        System.out.println("name: " + dog.getName());
        System.out.println("breed: " + dog.getBreed());
        System.out.println("-".repeat(dog.getBreed().length() * 2));

    }

    public static void main(String[] args) {
        Dog midnight = new Dog("Midnight", "Pomeranian");
        Dog shadow = new Dog("Shadow", "German Shepard");

        System.out.println("UNMODIFIED DOGS:");
        displayDog(midnight);
        displayDog(shadow);

        midnight.setName("Snowy");
        shadow.setBreed("Aspen");

        System.out.println("MODIFIED DOGS:");
        displayDog(midnight);
        displayDog(shadow);
    }
}
