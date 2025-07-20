package fileUtils;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void overwriteFile(String filename, ArrayList<String> contentList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String content : contentList) {
                writer.write(content);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error overwriting file: " + e.getMessage());
        }
    }

    public static ArrayList<String> readFromFile(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return lines;
    }

    public static boolean deleteFile(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            return file.delete();
        } else {
            System.out.println("File not found: " + filename);
            return false;
        }
    }
}
