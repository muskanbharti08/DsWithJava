

public class BR {

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

    public void CreateBinaryTree(){
        Node a = new Node(8);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(23);
        Node f = new Node(3);
        Node g = new Node(9);
        Node h = new Node(10);

        root = a;
        a.left = b;
        a.right =c;
        b.left=d;
        b.right =e;
        e.left = f;
        e.right =g;
        g.left=h;

    }

    public void PostOrder(Node root){
        if (root == null) {
            return;
        }

    PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        BR ob = new BR();
        ob.CreateBinaryTree();
        ob.PostOrder(ob.root);
    }


}