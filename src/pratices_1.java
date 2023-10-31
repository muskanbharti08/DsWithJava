
public class pratices_1 {
    public static void main(String[] args) {
        String str = "cow";
        System.out.println(Palindrome(str ));

    }
    public static boolean Palindrome(String st){
        int n = st.length();
        for (int i = 0; i < n/2; i++) {
            if (st.charAt(i)!= st.charAt(n-1-i)) {
                return  false;
            }

        }
        return true;
    }
}