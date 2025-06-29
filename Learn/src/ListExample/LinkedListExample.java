import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void printOutput(List<String> arr){
        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        List<String> countries = new LinkedList<>();
        countries.add("JAPAN");
        countries.add("PORTUGAL");
        countries.add("ARGENTINA");
        countries.add("SPAIN");
        countries.add("NIGERIA");

        countries.addFirst("INDIA"); // Add JAPAN at index 0,  countries.add(0, "JAPAN");
        countries.add(4, "GERMANY");

        // Step 1: Sort alphabetically
        Collections.sort(countries);

        // Step 2: Reverse the sorted list (descending order)
        Collections.reverse(countries);

        // Remove specific elements
        List<String> toRemove = Arrays.asList("PORTUGAL", "SPAIN");
        countries.removeAll(toRemove);

        printOutput(countries);

        countries.clear();
        printOutput(countries);
    }
}
