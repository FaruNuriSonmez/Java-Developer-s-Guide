import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        arrayList();
        arrayListType();
        examples();
        hasMap();
    }

    public static void arrayList(){
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara");

        for (Object i:numbers){
            System.out.println(i);
        }

        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        numbers.set(2,100);
        System.out.println(numbers.get(2));

        numbers.remove(2);
        System.out.println(numbers.size());

        numbers.clear();
        System.out.println(numbers.size());
    }

    public static void arrayListType(){
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Aydın");

        cities.remove("İstanbul");

        Collections.sort(cities);
        for(String i:cities){
            System.out.println(i);
        }
    }

    public static void examples(){
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Faru Nuri", "Sönmez"));

        customers.remove(0);

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }

    public static void hasMap(){
        HashMap<String,String> dictionary = new HashMap<String, String>();

        dictionary.put("book","kitap");
        dictionary.put("pencil","kalem");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");

        for (String item : dictionary.keySet()){
            System.out.println("Key:"+ item + " Value:"+dictionary.get(item));
        }
        
        System.out.println(dictionary);
        System.out.println(dictionary.get("book"));

        dictionary.remove("book");
        System.out.println(dictionary.get("book"));
    }
}
