import java.util.HashMap;

public class hash_map {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        // Insertion in hashmap
        hm.put("Mango",68);
        hm.put("Apple",98);
        hm.put("Lichi",18);
        hm.put("Carrot",86);
        hm.put("Banana",82);
        hm.put("Papaya",58);
        System.out.println(hm);

        //Remove
        hm.remove("Banana");
        System.out.println(hm);


        // ContainsKey --> if keys exist then true otherwise it'll return false
        Boolean b = hm.containsKey("Papaya");
        System.out.println(b);
        System.out.println(hm.containsKey("Plum"));

        // isEmpty-> for checking (key:value) exist or not
        System.out.print("HashMap is empty:  ");
//        System.out.print(hm.isEmpty());
        if (hm.isEmpty()) {
            System.out.println("yes");
        }
        System.out.println("No");

        // Get-> we can get the value of key
       int c =  hm.get("Apple");
        System.out.println("The value of Apple is  "+c);


    }
}
