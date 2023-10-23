package ie.atu;

public class Person {
    private String firstName;
    private String lastName;
    private int age;



    public Person() {
        this.firstName = "";
        this.lastname = "";
        this.age = 0;
    }


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", Age " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}