package CSV_Data_Handling.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filterrecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String header = br.readLine();
            System.out.println(header);

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");


                String name = data[0].trim();
                int marks = Integer.parseInt(data[1].trim());

                if (marks > 80) {
                    System.out.println(name + ", " + marks);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in CSV");
        }
    }
}
