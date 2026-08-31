import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    
    public static void main(String[] args) {
        
        var countryMap = new HashMap<String, String>();
        countryMap.put("India", "New Delhi");
        countryMap.put("France", "Paris");

        approach(countryMap);
    }

    //Using "keySet()" method: returns a set of all the keys present in the HashMap. We can use iterator() method to get an iterator for the key set and use it to iterate through HashMap. We can use for-each as well
    public static void approach(HashMap<String, String> countryMap) {

        Set<String> keys = countryMap.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {

            String key = iterator.next();
            String capital = countryMap.get(key);
            System.out.println(key + " : "  + capital);
        }

        // for(String key : keys) {

        //     String capital = countryMap.get(key);
        //     System.out.println(key + "" + capital);
        // }
    }


    //Using "entrySet()" method: returns a set of all key-value pairs in HashMap. We can use iterator() method to get an iterator for entry set and use it to iterate through HashMap. We can use for-each as well.
    public static void approach2(HashMap<String, String> countryMap) {

        Set<Map.Entry<String, String>> entries= countryMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String capital = entry.getValue();
            System.out.println(key + " : "  + capital);   
        }
    }

    public static void approach3(HashMap<String, String> countryMap) {

        Collection<String> values = countryMap.values();
        for(String value : values) {
            System.out.println(value);
        }
    }

}
