// Demonstrating the working of interface
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); 
    }
}