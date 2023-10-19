

public class Pratice {
    // creating a sturcture of Nodes
    Node root;
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int value){
            this.data = value;
            this.left = null;
            this.right =null;
        }

    }

    // Representation of creating a tree
    public void CreateBinaryTree(){
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(21);
        Node e = new Node(13);
        Node f = new Node(9);

         root = a;
         root.left = b;
         root.right =c;
         b.left =d;
         b.right=e;
         c.left=f;


    }


    public void Preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args) {
        Pratice obj = new Pratice();
        obj.CreateBinaryTree();
        obj.Preorder(obj.root);
    }
}
