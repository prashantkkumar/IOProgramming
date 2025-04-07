package Practice_Problems.JsonToObject;
import org.json.JSONObject;
public class CreateJsonObject {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name","Prashant");
        obj.put("age","22");
        obj.put("email","tubebute1173@gmail.com");

        System.out.println(obj.toString());

    }
}
