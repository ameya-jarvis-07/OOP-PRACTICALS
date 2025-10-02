// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Hierarchical Inheritance: Cat also inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class to test inheritance
public class Practical4__Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog myDog = new Dog();
        myDog.eat();   // inherited from Animal
        myDog.bark();  // defined in Dog

        System.out.println();

        // Hierarchical Inheritance
        Cat myCat = new Cat();
        myCat.eat();   // inherited from Animal
        myCat.meow();  // defined in Cat
    }
}