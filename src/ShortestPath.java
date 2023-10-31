// root of (x2)2-(x1)2 + (y2)2 - (y1)2

public class ShortestPath {
    public static void main(String[] args) {
        String str = "EENSWNSENSEEE";

        // E - East
        // W - West
        // N - North
        // S -South

        System.out.println(FindShortestPath(str));

    }

    public static float FindShortestPath(String st){
        int x =0;
         int y =0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch=='E'){
                x++;
            } else if (ch == 'W') {
                x--;
            } else if (ch=='N') {
                y++;
            }
            else {
                y--;
            }

        }

        int x2 = x*x;
        int y2= y*y;
        return (float) Math.sqrt(x2+y2);
    }
}