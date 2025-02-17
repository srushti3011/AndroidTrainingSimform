package javapractice;

abstract class Names {
    String firstName;
    String lastName;
    Names(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    void displayFirstName() {
        System.out.println(this.firstName);
    }
    void displayLastName() {
        System.out.println(this.lastName);
    }
    abstract String computeFullName();
}

class Person extends Names {
    Person(String fName, String lName) {
        super(fName, lName);
    }
    String computeFullName() {
        return super.firstName + super.lastName;
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Person personOne = new Person("Mally", "Sally");
        personOne.displayFirstName();
        personOne.displayLastName();
        System.out.println("Computing the Full Name " + personOne.computeFullName());
    }
}