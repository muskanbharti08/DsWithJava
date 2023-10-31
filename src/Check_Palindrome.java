import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        String str = "deified";
        System.out.println(check(str));

         //
//        System.out.println("Enter a String");
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        System.out.println(check(s1));
    }

    public static boolean check(String st){
        int n = st.length();
        for (int i = 0; i < n/2; i++) {
            if (st.charAt(i)!=st.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }
}