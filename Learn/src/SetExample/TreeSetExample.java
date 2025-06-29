package SetExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        Set<Integer> nums = new TreeSet<>(); // sorted
        nums.add(5);
        nums.add(1);
        nums.add(3);
        System.out.println(nums); // [1, 3, 5]
    }
}
