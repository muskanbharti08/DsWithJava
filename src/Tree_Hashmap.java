import java.util.TreeMap;

public class Tree_Hashmap {
    public static void main(String[] args) {
        TreeMap<String,Integer> thp = new TreeMap<>();
        thp.put("ss",98);
        thp.put("aa",77);
        thp.put("bb",25);
        thp.put("cc",67);
        System.out.println(thp);
        TreeMap<Integer,Integer> h = new TreeMap<>();
        h.put(60,1);
        h.put(34,1);
        h.put(70,1);
        h.put(10,1);
        System.out.println(h);
        
    }
}
