public interface Practical6_Interface {
    void display(); // abstract method
}


//create a class that implements the interface
class Practical6_InterfaceImpl implements Practical6_Interface {
    public void display() {
        System.out.println("Interface implemented successfully!");
    }
    public static void main(String[] args) {
        Practical6_InterfaceImpl obj = new Practical6_InterfaceImpl();
        obj.display(); // call the method
    }
}