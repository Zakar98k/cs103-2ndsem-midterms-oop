import java.util.ArrayList;

public class Person {
    // Define attributes for Person
    private final String name;
    private final int age;
    private final String address;

    // Define constructor for Person
    public Person(String personName, int personAge, String personAddress) {
        name = personName;
        age = personAge;
        address = personAddress;
    }

    // Display all attributes for each Person
    public static void displayPeople(ArrayList<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Person #" + (i+1));
            System.out.println("Name: " + people.get(i).name);
            System.out.println("Age: " + people.get(i).age);
            // Only print newline if not the last person
            if (i < people.size()-1)
                System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Don Quixote", 22, "The Limbus"));
        people.add(new Person("Zach", 19, "Laguna, Philippines"));
        people.add(new Person("Denji", 19, "Tokyo"));
        people.add(new Person("Jeff Bezos", 61, "Washington, United States"));
        people.add(new Person("Elon Musk", 54, "Mars"));

        displayPeople(people);
    }
}