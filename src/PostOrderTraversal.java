public class PostOrderTraversal {


    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    //Creating a tree

    public void CreateBinaryTree() {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(9);
        Node d = new Node(33);
        Node e = new Node(56);
        Node f = new Node(98);
        Node g = new Node(3);

        root =a;                   // root ----> a
        a.left = b;                // b <------a
        a.right = c;                // b <------a-------> c
        b.left = d;                    // d<--------b
        b.right = e;                    // d <------b------>e
        c.left = f;                     // f <-------c
        c.right = g;                    // f <-------c ------->g



    }


    public void postorder(Node root){

        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"   ");
    }

    public static void main(String[] args) {
        PostOrderTraversal obj = new PostOrderTraversal();

        obj.CreateBinaryTree();
        obj.postorder(obj.root);
    }
}
