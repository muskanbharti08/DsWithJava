import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class hash_Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("ak", 100);
        hm.put("bk", 45);
        hm.put("ck", 69);
        hm.put("dk", 89);
        hm.put("ek", 90);
        hm.put("fk", 49);
        System.out.println(hm);  // for printing whole hashmap, all key and value in pair but it will not print in order it prints randomly


        //    Iteration on HAshMap --> O(1)
        Set<String> st = hm.keySet();
//        System.out.println(st);  // for printing key only in such a mannner: [fk, ek, dk, ck, bk, ak]

        for (String a : st
        ) {
//            System.out.print(a+" ");  // output--> fk ek dk ck bk ak
            System.out.println("The value of " + a + "  is :" + hm.get(a));
        }


//        LinkedHashMap --> it stores the key and value as it is
        LinkedHashMap<String, Integer> Lh = new LinkedHashMap<>();
        Lh.put("English", 58);
        Lh.put("Hindi", 89);
        Lh.put("Physics", 73);
        Lh.put("Chemistry", 48);
        Lh.put("Mathematics", 81);
        System.out.println(Lh);

        Lh.remove("Physics");
        System.out.println(Lh);


//    TreeHashMap -- > self balanced tree
//        Stores automatically using red black tree
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("axe",67);
        tm.put("x-mas",78);
        tm.put("boy",5);
        tm.put("zoo",2);
        tm.put("cat",9);
        tm.put("rose",6);
        tm.put("egg",7);
        tm.put("apple",100);
        System.out.println(tm);  // in  assending order based of key value
    }
}
