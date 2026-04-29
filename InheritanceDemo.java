// Base class
class Vehicle {
    String model;
    int year;

    void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    int numDoors;
    String fuelType;

    void displayCarInfo() {
        // Accessing parent class attributes
        displayVehicleInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.model = "Toyota Corolla";
        car.year = 2022;
        car.numDoors = 4;
        car.fuelType = "Petrol";

        car.displayCarInfo();
    }
}