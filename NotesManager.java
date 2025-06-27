import java.io.*;

public class NotesManager {
    public static void main(String[] args) {
        String filename = "notes.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Java FileWriter and BufferedReader Example\n");
            writer.write("1. Write notes using FileWriter.\n");
            writer.write("2. Read notes using BufferedReader.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
