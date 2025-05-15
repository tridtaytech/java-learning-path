// Define the Car class
class Car {
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

// Main class to demonstrate object creation
public class TestObject {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Honda", 2021); //Object

        // Access and print the object's properties
        System.out.println("Car Model: " + myCar.model);  // → Behavior: 
        System.out.println("Car Year: " + myCar.year);  
    }
}