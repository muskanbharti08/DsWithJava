
public class SelectionSort {
    public static void main(String[] args) {
        int [] array ={3,23,1,3,2,8,3,7,4,5};


        SelSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }


    public static void SelSort(int [] ar){
        int n = ar.length;

        for (int i = 0; i <(n-1) ; i++) {
            int minposition = i;
            for (int j = i+1; j < n; j++) {                if (ar[minposition]>ar[j]) {
                    minposition = j;
                }
                int temp =ar[minposition];
                    ar[minposition]=ar[i];
                    ar[i]=temp;
                }

            }

        }
    }