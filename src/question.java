import java.util.HashMap;
import java.util.Set;

public class question {
    public static void main(String[] args) {
        int array [] = {1,2,3,3,3,4,4,5,5,1,2,7,7,8,8,8};
        sol(array);
    }

    public static void sol(int [] ar){
        int n = ar.length;              //length of array

//        Hashmap me (key and value) store hota hai
//        key ki jgh element aur value ki jgh element ka frequency(kitni bar aaya element) store hoga
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int x = ar[i];

//            hm.put(x,hm.containsKey(x)?hm.put(x,hm.get(x)+1):1);

            if (hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);  // agr contain krega to frequency me 1 add krenge
            }
            else {
                hm.put(x,1);            
            }

        }

        Set<Integer> s = hm.keySet();
        for (int a : s) {
            if (hm.get(a)>2){
                System.out.print(a+" ");
            }


        }
    }


}