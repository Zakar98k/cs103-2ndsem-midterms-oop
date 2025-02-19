public class Person {
    // Define attributes for Person
    private String name;
    private int age;
    private String address;

    // Define constructor for Person
    public Person(String personName, int personAge, String personAddress) {
        name = personName;
        age = personAge;
        address = personAddress;
    }

    // Display all attributes for Person
    public void personInfo(Person person) {
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);
    }

    public static void main(String[] args) {
        Person donQuixote = new Person("Don Quixote", 30, "The Limbus");
    }
}