
//Representation of binary tree

public class Representation_Of_Binary_Tree {

    // Creating structure of Node

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

    public static void main(String[] args) {
        Representation_Of_Binary_Tree obj = new Representation_Of_Binary_Tree();
        obj.CreateBinaryTree();
        System.out.println(obj.root.right.right.data);
    }













}
