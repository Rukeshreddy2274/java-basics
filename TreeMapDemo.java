import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    
    public static void main(String[] args) {
        
        Map<Integer, String> nums = new TreeMap<>(); 
        nums.put(23, "Two three");
        nums.put(12, "Tweleve");
        nums.put(42, "Four two");

        for(Map.Entry<Integer, String> entry : nums.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
