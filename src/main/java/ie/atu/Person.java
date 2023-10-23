package ie.atu;

public class Person {
    private String firstname;
    private String lastname;
    private int age;



    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
    }


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}