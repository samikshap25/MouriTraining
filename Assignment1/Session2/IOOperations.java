
import java.io.FileWriter;  // Import FileWriter class
import java.io.IOException;  // Import IOException for handling errors

public class IOOperations {
    public static void main(String[] args) {

        // Step 1: Create a string to write
        String text = "This is a test.";

        try {
            // Step 2: Create FileWriter object
            FileWriter writer = new FileWriter("assignment_output.txt");

            // Step 3: Write text to the file
            writer.write(text);

            // Step 4: Close the file to save changes
            writer.close();

            System.out.println("Text written to file successfully!");

        } catch (IOException e) {  // Handle exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

