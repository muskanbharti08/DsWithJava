public class HeightOfTree {
    Node root;

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);
        Node t7 = new Node(7);
        Node t8 = new Node(8);
                                            //                      1
        Node root = t1;                     //                   /
        t1.left = t2;                       //                  2
        t2.right =t3;                       //                   \
        t3.left = t4;                       //                    3
        t4.left = t5;                       //                   /
        t4.right = t6;                      //                  4
        t6.left = t7;                       //                 / \
        t7.right = t8;                      //                5   6
                                            //                   /
                                            //                  7
                                            //                  \
                                            //                   8
        System.out.println("The Height of the Tree is "+Height(root));


    }

    public static int Height(Node root){
        if (root == null) {          // Base Case if root is null return 0
            return 0 ;
        }
                                    // else compare the Left Height and right Height of a Root  ->  After getting Max Height, +1
        int lh= Height(root.left);  // recursion
        int rh=Height(root.right);  // recursion

        return  Math.max(lh,rh)+1;
    }


}
