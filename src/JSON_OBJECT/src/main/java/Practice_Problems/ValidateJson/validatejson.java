package Practice_Problems.ValidateJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class validatejson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            String filePath = "C:\\Users\\Prashant Kumar\\OneDrive\\Desktop\\JAVA\\week5\\src\\JSON_OBJECT\\src\\main\\java\\Practice_Problems\\ReadJsonFile\\data.json";
            File jsonFile = new File(filePath);
            Object json = mapper.readValue(jsonFile,Object.class);
            System.out.println("This is a Valid JSON file");

        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
