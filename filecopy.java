import java.io.*;

public class filecopy {

    public static void main(String[] args) {
        // Specify source and destination file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // FileReader and FileWriter within a try-with-resources statement
        try (FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath)) {

            // Buffer for data transfer
            byte[] buffer = new byte[1024];
            int length;

            // Read from source and write to destination
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: I/O error occurred - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred - " + e.getMessage());
        }
    }
}

