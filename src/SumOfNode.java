

public class SumOfNode {

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
        Node n1 = new Node(8);
        Node n2 = new Node(3);
        Node n3 = new Node(1);
        Node n4 = new Node(2);
        Node n5 = new Node(5);
        Node n6 = new Node(4);
        Node n7 = new Node(9);

                                        //            root -> 8
        Node root = n1;                 //                   / \
        n1.left = n2;                  //                   3   1
        n2.right = n3;                //                       / \
        n3.left = n4;                //                       2   5
        n3.right = n5;              //                           / \
        n5.left = n6;               //                          4   9
        n5.right = n7;             //


        System.out.println("Sum of all node's values is "+SumOfNode(root));
    }

    public static int SumOfNode(Node root){
        if(root == null) return 0;

        int Lh = SumOfNode(root.left);
        int Rh = SumOfNode(root.right);

        return Lh+Rh+root.data;
    }

}
