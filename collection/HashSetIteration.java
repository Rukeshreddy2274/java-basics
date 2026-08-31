import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {

    public static void main(String[] args) {
        
        Set<String> superPowers = new HashSet<>();

        superPowers.add("Shape");
        superPowers.add("Strength");
        superPowers.add("Rich");

        //Using for-each
        for(String superPower : superPowers) {
            System.out.println(superPower.toUpperCase());
        }

        //Using iterator - we can only use any one
        Iterator<String> iterator = superPowers.iterator();
        while (iterator.hasNext()) {
            String sp = iterator.next();
            System.out.println(sp.toLowerCase());
        }
    }
}