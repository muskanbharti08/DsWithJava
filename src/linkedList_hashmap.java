import java.util.LinkedHashMap;

public class linkedList_hashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhp = new LinkedHashMap<>();   // it arranges in sequence..
        lhp.put("ram",89);
        lhp.put("shyam",88);
        lhp.put("shyam",88);
        lhp.put("shyam",98);
        lhp.put("mohan",58);
        System.out.println(lhp);

    }
}
