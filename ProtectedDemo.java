// Base class
class Person {
    protected String name;
    protected int age;

    protected void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass (same package)
class Student extends Person {

    void displayStudent() {
        // Accessing protected members from superclass
        name = "Rahul";
        age = 20;

        displayPerson();
        System.out.println("Student details displayed successfully");
    }
}

// Another class in same package (not a subclass)
class Teacher {

    void show() {
        Person p = new Person();
        // Protected members are accessible in the same package
        p.name = "Anita";
        p.age = 35;
        p.displayPerson();
    }
}

// Main class
class ProtectedDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.displayStudent();

        Teacher t = new Teacher();
        t.show();
    }
}