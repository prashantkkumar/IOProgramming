package PracticeHandOnProblem.JsonTOXml;

import org.json.JSONObject;
import org.json.XML;

import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonToxml {
    public static void main(String[] args) throws Exception {
        String path1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Prashant Kumar\\OneDrive\\Desktop\\JAVA\\week5\\src\\JSON_OBJECT\\src\\main\\java\\Practice_Problems\\FilterJSON\\Data.json")));

        JSONObject obj1 = new JSONObject(path1);
        String XMl = XML.toString(obj1);

        System.out.println(XMl);
    }
}
