public class practice11 {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node root = n1;                                  // 1  -> root
        n1.left = n2;                                  // /   \
        n1.right = n3;                               //  2     3
        n2.left = n4;                               //  / \
        n2.right = n5;                              // 4   5
        n5.left = n6;                              //     / \
        n5.right=n7;                             //      6   7

        System.out.println( Height(root));
    }
    public static int Height(Node root){
        // if root is empty then return 0.
        if (root == null) {
            return 0;
        }

        int ls =  Height(root.left);
        int rs =  Height(root.right);
        return  Math.max(ls,rs)+1;

    }
}
