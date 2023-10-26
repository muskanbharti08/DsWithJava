import java.util.ArrayList;

public class hp {
    static class hea_p {
        static ArrayList<Integer> a = new ArrayList<>();

        public void add(int data) {
            a.add(data);


            int x = a.size() - 1;
            int parent = x - 1 / 2;

            while (a.get(x)<a.get(parent)) {
                int temp = a.get(x);
                a.set(x,a.get(parent));
                a.set(parent,temp);
            }
        }

        public static void main(String[] args) {
            hea_p ob = new hea_p();
            ob.add(23);
            ob.add(13);
            ob.add(98);
            ob.add(26);

            for (int x: a
                 ) {
                System.out.println(x);

            }
        }
        // heapify

        public void heapify(int i ){
       int     left = 2*i+1;
          int   right = 2*i+2;
           int maxIndex = i;
            if (right<a.size() && a.get(right)>a.get(maxIndex)) {
                maxIndex = i;
            }
            if (maxIndex!=i) {
//                swap
                int temp = a.get(i);
                a.set(i,a.get(maxIndex));
                a.set(maxIndex,i);
                heapify(maxIndex);
            }
        }
    }
}
