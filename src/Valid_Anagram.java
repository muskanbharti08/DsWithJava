import java.util.HashMap;
import java.util.Scanner;

public class Valid_Anagram {
    public static void main(String[] args) {
        String  str1 = "noon";
        String str2 = "moon";
        System.out.println(Check(str1,str2));
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        System.out.println("Enter a String");
        Scanner sc1 = new Scanner(System.in);
        String a2 = sc.nextLine();

        System.out.println(Check(a1,a2));
    }

    public static boolean Check(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }  // if the length of String is not equal code will terminate here itself

        HashMap<Character, Integer> hm = new HashMap<>();
//                key         value
//     charecter of string   frequecy of charecter

        for (int i = 0; i < s1.length(); i++) {
            char chr = s1.charAt(i);

            if (hm.containsKey(chr)) {
                hm.put(chr, hm.get(chr) + 1);
            } else {
                hm.put(chr, 1);
            }

        }
        for (int i = 0; i < s2.length(); i++) {
            char chr2 = s2.charAt(i);

            if (hm.containsKey(chr2)) {
                if (hm.get(chr2) == 1) {
                    hm.remove(chr2);
                } else {
                    hm.put(chr2, hm.get(chr2) - 1);
                }
            } else {
                return false;
            }
        }

        if (hm.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }

     }
}
