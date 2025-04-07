package PracticeHandOnProblem.ValidateEmail;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class validateEmail {
    public static void main(String[] args) throws  Exception {
        String path = new String(Files.readAllBytes(Paths.get("C:\\Users\\Prashant Kumar\\OneDrive\\Desktop\\JAVA\\week5\\src\\JSON_OBJECT\\src\\main\\java\\Practice_Problems\\ReadJsonFile\\data.json")));

        JSONObject obj = new JSONObject(path);

        boolean flag = false;
        for(String key : obj.keySet()){
            if(obj.get(key).toString().equals("tubebute1173@gmail.com")){
                System.out.println("Mail is Present");
                flag = true;
                break;
            }

        }

        if(flag==false){
            System.out.println("Mail is not Present");
        }
    }
}
