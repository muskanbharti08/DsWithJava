import java.io.File;
import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        System.out.println("Enter your name");   // Asking The input from user
        Scanner sc = new Scanner(System.in);     // Storing the input
        String st = sc.nextLine();
        System.out.println(st.toUpperCase());    // toUpperCAse() is used for Capital
        System.out.println("My name is "+st.replace(" ","_"));  // replace() -> used for replacement ->old charecter to new charecter
        String str = "String";
        System.out.println(str.indexOf("i"));    // indexOf()  ->  used for getting the index of the charecter
        System.out.println(str.substring(2)+" is the substring of "+str);   // subString()  -> used for get e new word from given
        System.out.println("The total length of "+str+" is "+str.length());   // length() -> is used for get the length of string
        if(str.equals("Strings")){
            System.out.println("True");
        }else
        System.out.println("false");



    }
}