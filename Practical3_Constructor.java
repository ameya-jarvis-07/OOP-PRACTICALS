public class Practical3_Constructor {
    int id;
    String name;

    // Default constructor
    Practical3_Constructor() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Practical3_Constructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Practical3_Constructor obj1 = new Practical3_Constructor();
        obj1.display();

        // Creating object using parameterized constructor
        Practical3_Constructor obj2 = new Practical3_Constructor(1, "Alice");
        obj2.display();
    }
}
