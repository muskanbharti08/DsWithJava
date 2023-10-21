import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Iteration_Inhash {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Mn",89);
        hm.put("Pq",90);
        hm.put("Rs",78);
        hm.put("Ab",47);
        System.out.println(hm);

        Set<String> keys = hm.keySet();


        for (String s: keys
             ) {
            System.out.println("The  value of key "+s+" is= "+hm.get(s));
        }
    }
}
