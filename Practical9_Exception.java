class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message);
    }
}
public class Practical9_Exception {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is a user-defined exception");
        } catch (UserDefinedException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}