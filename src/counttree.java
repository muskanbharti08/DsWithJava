public class counttree {
    public static class Node{
        int data;
        Node right;
        Node left;



        public  Node(int dt){
            this.right = null;
            this.left = null;
            this.data = dt;
        }
    }


    public static int countNodes(Node root) {


        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        int tot =leftCount+rightCount+1;
                return  tot;


    }


    public static int sum(Node root) {

        if (root==null) {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);

        return ls+rs+root.data;


    }



    public static void main(String[] args) {
        Node root ;
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        Node a7 = new Node(7);

        root = a1;
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a4.left = a5;
        a5.left = a6;
        a5.right = a7;

//        System.out.println(countNodes(root));
        System.out.println(sum(root));


    }
}
