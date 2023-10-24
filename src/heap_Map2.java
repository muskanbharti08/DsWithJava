import java.util.ArrayList;

public class heap_Map2 {
    public static void main(String[] args) {
        heap ob = new heap();
        ob.add(2);
    }
    static class heap{
        public void add(int data){
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(data);
            int x = ar.size()-1;
            int p = x-1/2;
            while (ar.get(x)<ar.get(p)){
                int temp= ar.get(x);
                ar.set(x,ar.get(p));
                ar.set(p,temp);
            }


        }
    }
}