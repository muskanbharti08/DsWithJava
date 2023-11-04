import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
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
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node root = n1;                                     //        root ->  1
        n1.left = n2;                                       //                / \
        n1.right = n3;                                     //                2   3
        n3.right = n4;                                     //                   / \
        n4.left =n5;                                       //                  4   5
        n5.left = n6;                                      //                     / \
        n5.right = n7;                                     //                    6    7
        LevelOrder(root);

    }

        public static void LevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);    // enqueue root

        if (root == null) return;               // if root is null it means queue is empty int this case - return

                                                // else

        while (!queue.isEmpty()){              // while loop will run until queue is empty
            Node temp= queue.poll();           // poll the value which is stored in queue  and stored in temp
            System.out.print(temp.data+" ");   // print the temp value

            if (temp.left != null){
                queue.offer(temp.left);
            }       // check temp's left is empty or not if it's not empty -> offer or enqueue the left value of temp in the queue

            if (temp.right != null){
                queue.offer(temp.right);
            }     // if  temp's right exists -> offer the value in queue

        }
        }
}
