package CSV_Data_Handling.Intermediate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class modifyCSV {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input file = ");
        String inputFilePath = sc.nextLine();
        String outputFilePath = "updated_employees.csv";

        List<String[]> employeeData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String header = br.readLine();
            employeeData.add(header.split(","));

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length < 3) continue;

                String department = data[1].trim();
                double salary = Double.parseDouble(data[2].trim());


                if (department.equalsIgnoreCase("IT")) {
                    salary *= 1.10;
                }


                employeeData.add(new String[]{data[0], department, String.format("%.2f", salary)});
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String[] row : employeeData) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            System.out.println("Updated file saved as: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
