import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String a = sc.nextLine();
        pq.wave(a);
        pq.wave(3);
    }

    class pq {
        static void wave() {
            System.out.println("Welcome");
        }

        static void wave(String c) {
            System.out.println("Welcome " + c);

        }

        static void wave(int a) {
            System.out.println("guhfghfgh");
        }
    }
}