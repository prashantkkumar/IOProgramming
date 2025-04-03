package CSV_Data_Handling.Intermediate;

import java.io.*;
import java.util.*;

public class sortCSVbycol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path = ");
        String filePath = sc.nextLine();
        List<String[]> employeeData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            System.out.println(header);

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 3) continue;
                employeeData.add(data);
            }


            employeeData.sort((a, b) -> Double.compare(Double.parseDouble(b[2].trim()), Double.parseDouble(a[2].trim())));


            System.out.println("Top 5 Highest-Paid Employees:");
            for (int i = 0; i < Math.min(5, employeeData.size()); i++) {
                System.out.println(String.join(", ", employeeData.get(i)));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid salary format in CSV.");
        }
    }
}
