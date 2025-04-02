package CSV_Data_Handling.Basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class countrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path = ");
        String filePath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int cnt=0;
            while ((line = br.readLine()) != null) {
                cnt++;
            }
            System.out.println("The number of lines are = "+ cnt);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());


    }
}}
