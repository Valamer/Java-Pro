import java.awt.*;
import java.io.*;

public class FileOperations {
    public static void writeToFile(String filePath, String input) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(input);
        } catch (IOException exception) {
            throw new RuntimeException("Something went wrong during writing into file");
        }
    }

    public static List readFile (String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List result = new List();
            while (reader.ready()) {
                result.add(reader.readLine());
            }
            return result;
        }
    }
}
