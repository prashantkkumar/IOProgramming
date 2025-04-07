package PracticeHandOnProblem.JavaObjectToJsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

//Rahul Patel
class User {
    String name;
    int age;

    User(String name,int age){
        this.name = name;
        this.age = age;
    }

    JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("name ",this.name);
        obj.put("age",this.age);

        return obj;
    }
}
public class JobjectToJsonArray {
    public static void main(String[] args) {
       User u1 = new User("Prashant",21);
        User u2 = new User("Himanshi",21);

        ArrayList<User> arr = new ArrayList();
        arr.add(u1);
        arr.add(u2);

        JSONObject obj = new JSONObject();


        JSONArray arr1 = new JSONArray();
        for(User user : arr){
            arr1.put(user.toJson());
        }

        System.out.println(arr1);
    }
}
