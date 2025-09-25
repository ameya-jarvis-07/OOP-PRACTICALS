public class Practical1_Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using third variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10

        System.out.println("After swapping without third variable: a = " + a + ", b = " + b);

        // Resetting values
        a = 5;
        b = 10;

        // Swapping using third variable
        int temp;
        temp = a; // temp now holds the value of a (5)
        a = b;    // a now becomes 10
        b = temp; // b now becomes 5

        System.out.println("After swapping with third variable: a = " + a + ", b = " + b);
    }
}
