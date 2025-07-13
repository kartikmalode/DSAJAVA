package Hashing;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();

        //insert
        hm.put("India", 91);
        hm.put("Japan", 1);
        hm.put("America", 45);
        hm.put("Nepal", 92);

        //iterarte
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key = "+k+", value= "+hm.get(k));
        }

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Nepal"));
        hm.remove("Japan");
        System.out.println(hm);
        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
    
}
