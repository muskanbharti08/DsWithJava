import java.util.HashMap;

public class valid_Anagram {
    public static void main(String[] args) {
//         do string ko valid anagram tb bolte hai jb unki length same ho aur unme jo charecter aaye hai uski frequency se

        String a = "rat";   // 4
        String b = "cat";  // 4
        System.out.println(check(a,b));
    }

    public static boolean check(String a, String b) {
        if (a.length() != b.length()) return false;   //  agr length equal nhi hai to anagram nhi ho skta

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
//             hm.put(ch,1);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

            for (int j = 0; j < b.length(); j++) {
                char c = b.charAt(j);
                if (hm.containsKey(c)) {
                    if (hm.get(c) == 1) {
                        hm.remove(c);
                    } else {
                        hm.put(c, hm.get(c) - 1);
                    }

                } else {
                    return false;
                }

            }

            if (hm.isEmpty()) {
                return true;
            }
            return false;


        }



}
