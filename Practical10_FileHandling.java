import java.io.File;

public class Practical10_FileHandling {
    public static void main(String[] args) {
        File file = new File("txt/example.txt");

        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());

            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }

            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }

            if (file.isHidden()) {
                System.out.println("File is hidden.");
            } else {
                System.out.println("File is not hidden.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

