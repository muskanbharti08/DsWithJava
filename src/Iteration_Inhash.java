import java.util.HashMap;
import java.util.Set;

public class Iteration_Inhash {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =  new HashMap<>();
        hm.put("Pine Apple",9);
        hm.put("Papaya",8);
        hm.put("Orange",5);
        hm.put("Grapes",7);
        hm.put("Plum",6);
        System.out.println(hm);

        Set<String> k = hm.keySet();   // it is used for key only
        System.out.println(k);

        for (String s : k
             ) {
            System.out.print(s+" ");
            System.out.println("The value of "+s+" is " +hm.get(s));

        }
    }
}