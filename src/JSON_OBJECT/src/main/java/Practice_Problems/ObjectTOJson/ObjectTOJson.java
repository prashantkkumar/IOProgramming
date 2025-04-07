package Practice_Problems.ObjectTOJson;
import com.fasterxml.jackson.databind.ObjectMapper;

class User{
    String name;
    String surname;


    User(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    void PrintData(){
        System.out.println(name+surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
public class ObjectTOJson {
    public static void main(String[] args) {
        User us = new User("Prashant","Kumar");

        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(us);

            System.out.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }
     }
}
