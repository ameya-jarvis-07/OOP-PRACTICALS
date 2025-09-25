public class Practical2_Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern
        for (int i = 1; i <= rows; i++) { // Outer loop for each row
            for (int j = 1; j <= i; j++) { // Inner loop for printing stars in each row
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
