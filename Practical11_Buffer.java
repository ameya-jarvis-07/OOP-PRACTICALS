import java.io.*;

public class Practical11_Buffer{
    public static void main(String[] args) {
            String inputFile = "txt/input.txt";
            String outputFile = "txt/output.txt";

            try{
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

                String line;
                while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                }

                reader.close();
                writer.close();
                System.out.println("File copied successfully using BufferedReader and BufferedWriter.");
            } 
            catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
    }
}