package ListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // uses dynamic array
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("PineApple");

        fruits.remove(1); // by index
        fruits.remove("Mango"); // by object

        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}