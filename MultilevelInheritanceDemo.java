// Base class
class Animal {
    String name;

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class (Level 2)
class Mammal extends Animal {
    boolean hasFur = true;

    void walk() {
        System.out.println("Mammal walks on land");
    }
}

// Derived class (Level 3)
class Dog extends Mammal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.name = "Buddy";

        System.out.println("Name: " + d.name);
        System.out.println("Has Fur: " + d.hasFur);

        d.eat();    // From Animal
        d.walk();   // From Mammal
        d.bark();   // From Dog
    }
}