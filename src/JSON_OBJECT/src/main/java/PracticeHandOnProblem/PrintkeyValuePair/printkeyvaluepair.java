package PracticeHandOnProblem.PrintkeyValuePair;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

//Rahul Patel
public class printkeyvaluepair {
    public static void main(String[] args) throws Exception {
        String path = new String(Files.readAllBytes(Paths.get("C:\\Users\\Prashant Kumar\\OneDrive\\Desktop\\JAVA\\week5\\src\\JSON_OBJECT\\src\\main\\java\\Practice_Problems\\ReadJsonFile\\data.json")));

        JSONObject obj = new JSONObject(path);

       for(String key : obj.keySet()){
           System.out.println("key -> "+key + "value -> " +  obj.get(key));
       }
    }
}
