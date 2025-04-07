package Practice_Problems.MergeTwoJsonObject;

import org.json.JSONObject;

public class mergejsonobject {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("name" , "Prashant");
        obj1.put("email" , "tubebute1173@gmail.com");

        JSONObject obj2= new JSONObject();
        obj2.put("name" , "rahul");
        obj2.put("email" , "psh@gmail.com");

        JSONObject merged = new JSONObject();
        merged.put("object1", obj1);
        merged.put("object2", obj2);

        System.out.println(merged.toString(2));

    }
}
