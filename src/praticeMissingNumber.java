public class praticeMissingNumber {
    public static void main(String[] args) {
        int [] RefArray ={2,1,3,5,7,6,8};
        ToFindMissingElementOfArray(RefArray);
        BubbleSort(RefArray);
        System.out.println("Array is sorted by bubble sort");
        for (int a:RefArray
             ) {
            System.out.print(a+" ");

        }
        }



    public static void ToFindMissingElementOfArray(int [] ar){
        int n = ar.length+1;
        int sum = n*(n+1)/2;

        for (int i = 0; i < ar.length; i++) {
            sum-=ar[i];
        }
        System.out.println("The missing number is "+sum);
    }


    public static void BubbleSort(int[]ar){

        int l = ar.length;
        for (int i = 0; i < (l - 1); i++) {int swap=0;
            for (int j = 0; j < (l-1)-i; j++) {

                if (ar[j]>ar[j+1]) {
                    int temp = ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
                if (swap==0) {
                    break;
                }

            }
        }
    }



}
