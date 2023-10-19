import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Odd_Even();
        Number();
        System.out.println("");
        even();
        System.out.println();
        odd();
        System.out.println();
        Sum_Of_Two_Numbers();
        System.out.println();
        Length_Of_String();
        Length_Of_Array();
      }
public static void Odd_Even(){
    System.out.println("Enter a number ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (a % 2 == 0) {
        System.out.println(a+ " is even number");
    }
    else {
        System.out.println(a+" is odd number");
    }

}

// Write a for loop that prints the numbers 1 to 10
public static void Number(){
    for (int i = 1; i <=10 ; i++) {
        System.out.print(i+"  ");

    }
}


//Write a loop that prints the even numbers between 1  and 10
    public static void even(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }

//   Write a loop that prints the odd number between 1 and 10
public static void odd(){
    for (int i = 1; i <=10 ; i++) {
        if (i % 2 != 0) {
            System.out.print(i+" ");
        }

    }
}

//Write a function that takes in two numbers and returns their sum
    public static void  Sum_Of_Two_Numbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();


        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(" The sum of two numbers  is: "+(a+b));
    }

//   Write a function that takes in a string and returns the length of the string
     public static void Length_Of_String(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter an String");
        String st = sc.nextLine();
    System.out.println("Length of the string is : "+st.length());


}

// Write a function that takes in array and return the length of the array
    public static void Length_Of_Array(){
        int [] array ={3,45,56,43,56,23,21,67,90};
        System.out.println(array.length);
    }

}
