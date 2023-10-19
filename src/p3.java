public class p3 {
    public static void main(String[] args) {
        int [] array ={2,45,6,2,1,5,6,3,56,6};
        LinearSEarch(array,1);
        System.out.println("  ");
        int [] a = InseertSearch(array);
        Print(a);
        System.out.println("");
        System.out.println("Bubble-Sort");
        BbbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }


    }

    public static void LinearSEarch(int [] ar,int x){
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if (ar[i]==x) {
                System.out.print(x+" index "+i+" pe hai ");
            }

        }
    }

    public static int [] InseertSearch(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp =arr[i];
            int j =i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] =arr[j];
                j--;

            }
            arr[j+1] = temp;

        }
return arr;
    }

    public static void BbbleSort(int [] ar){
        int n = ar.length;
        for (int i = 0; i < (n - 1); i++) {
            int swap =0;
            for (int j = 0; j < (n-1)-j; j++) {
                while (ar[j]>ar[j+1]){
                    int temp = ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }

            }
        }
    }

    public static void Print(int [] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");

        }
    }
}
