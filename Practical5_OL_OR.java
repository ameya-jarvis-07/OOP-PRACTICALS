// Base class
class Animal {
    // Method Overloading: same method name, different parameters
    void sound() {
        System.out.println("Animal makes a sound.");
    }

    void sound(String type) {
        System.out.println("Animal makes a " + type + " sound.");
    }
}

// Derived class
class Dog extends Animal {
    // Method Overriding: redefining the base class method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class to test both concepts
public class Practical5_OL_OR {
    public static void main(String[] args) {
        // Method Overloading
        Animal genericAnimal = new Animal();
        genericAnimal.sound();               // No parameter
        genericAnimal.sound("growling");     // Overloaded with parameter

        System.out.println();

        // Method Overriding
        Dog myDog = new Dog();
        myDog.sound();                       // Overridden method
    }
}