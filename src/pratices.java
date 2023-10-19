
//Reverse all element of an array

public class pratices {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6};

      int [] a=  Reverse(array);
        for (int el:a) {
            System.out.print(el+" ");
        }
        System.out.println(" ");
        int b=FIndMax(array);
        System.out.println("Maximum element of an array is: "+b);
        FindMin(array);

    }

    public static int  [] Reverse(int [] ar){
        int start=0;
        int end = ar.length-1;
        int temp =0;

        while(start < end){
            temp= ar[start];
            ar[start] = ar[end];
            ar[end]=temp;
            start++;
            end--;

        }
        return ar;
    }

    //FInd max element of an array

    public static int FIndMax (int [] ar){

        int max =ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]>max) {
                max = ar[i];
            }
        }
            return max;
        }

    public static void FindMin(int [] ar){
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<min) {
                min=ar[i];
            }

        }
        System.out.println("Minimum element of an array is: "+min);
    }



}
