import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args) {
        HashSet<Integer>  hs = new HashSet<>();
        hs.add(4);
        hs.add(8);
        hs.add(2);
        hs.add(1);
        hs.add(8);

//        Methods of HashSet
        System.out.println(hs);
        int x = hs.size();
        System.out.println(x);
          boolean c = hs.contains(1);
        System.out.println(c);
        System.out.println(hs.contains(3));
//
//        Iterator<Integer> i = hs.iterator();
//        while (i.hasNext()){
//            System.out.print(i.next()+" ");
//        }

//       1 2 4 8


        for (int s: hs
             ) {
            System.out.print(s+" ");
             

        }
    }
}