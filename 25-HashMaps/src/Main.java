import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        myMap.put("User1",5);
        myMap.put("User2",3);
        myMap.put("User3",1);

        String user1 = String.valueOf(myMap.get("User1"));
        System.out.println(user1 + " Level");

       for (Map.Entry<String, Integer> entry: myMap.entrySet()){
           String key = entry.getKey();
           Integer value = entry.getValue();

           System.out.println(key + ": " + value + " Level");
       }
    }
}
