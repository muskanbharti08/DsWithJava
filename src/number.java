

public class number {
    public static void main(String[] args) {


        int sum =0;
        for (int i = 1; i <= 15; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
                i++;
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("sum of evens between 1 to 15 is :"+sum);
        even();
    }

    public static void even(){
        for (int i = 1; i < 100; i++) {
            if (i%2 != 0){
                System.out.print(i+" ");

            }

        }
    }

    public static void odd(){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0){
//                System.out.print();
            }

        }


    }





}