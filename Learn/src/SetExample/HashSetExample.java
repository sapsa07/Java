import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Red"); // Ignored
        System.out.println(colors); // [Red, Green]
    }
}
