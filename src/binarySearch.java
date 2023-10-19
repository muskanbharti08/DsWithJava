

public class binarySearch {
    public static void main(String[] args) {
        int [] array ={1,3,4,5,6,7,8,9,10};
        MissingNumber(array);

        int a = BinarySearch(array,6);
        System.out.println(a);

    }
    public static void MissingNumber(int [] ar){
        int n = ar.length+1;    //+1 because 1 number is missing here

        int TotalSum = n*(n+1)/2;

        for (int i = 0; i < ar.length; i++) {
            TotalSum-=ar[i];

        }
        System.out.println("Missing number of an array is "+TotalSum);
    }



    public static int BinarySearch(int []ar,int x){
        int low =0;
        int high = ar.length-1;
        int mid;

        while(low<=high){

            mid =(low+high)/2;

            if (ar[mid]==x) {
                return mid;
            }
            else if (ar[mid]<x) {
                low = mid+1;

            }
            else {
                high = mid-1;
            }

        }
        return -1;

    }
}