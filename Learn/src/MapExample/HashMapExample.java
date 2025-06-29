package MapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        Map<String, Integer> prices = new HashMap<>();
        prices.put("Apple", 50);
        prices.put("Banana", 20);
        prices.put("Apple", 60); // Overwrites

        System.out.println(prices.get("Apple")); // 60
    }
}
