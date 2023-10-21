import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("Abc",98);
        h.put("bcd",78);
        h.put("def",66);
        h.put("fgh",99);
        System.out.println(h);

        int x = h.get("fgh");
        System.out.println(x);
        h.put("def",0);
        System.out.println(h);
        boolean c = h.containsKey("rn");
        System.out.println(c);
        System.out.println(h.containsKey("Abc"));

        h.remove("Abc");
        System.out.println(h);
        System.out.println(h.isEmpty());

//        h.clear();
//        System.out.println(h);
        System.out.println(h.size());



    }
}