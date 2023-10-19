
// Write an if statement that checks if a number is greater than 5

import java.util.Scanner;

public class pQ {
    public static void main(String[] args) {
        stringChecker();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int a = sc.nextInt();
        if (a<5) {
            System.out.println(a+" is smaller");
        }
        else if (a>5) {
            System.out.println(a+" is greater");

        }
        else {
            System.out.println(a+" is equal to given number");
        }

    }

// Write an if statement that checks  if string is empty

    public static void stringChecker(){

        System.out.println("Enter a String");
        Scanner st = new Scanner(System.in);
        String  s = st.nextLine();
        int l = s.length();

        if (l>=0){
            System.out.println("String is not empty");
        }
else {
            System.out.println("String is empty");
        }




         }




}