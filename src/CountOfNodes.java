public class CountOfNodes {
    TreeNode root;
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.data = value;
            this.left = null;
            this.right = null;

        }
    }


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
                                                //                   1  <- root
        TreeNode root = n1;                     //                  / \
        n1.left = n2;                           //                 2   3
        n1.right = n3;                          //                /
        n2.left = n4;                           //               4
        n4.left = n5;                           //              /
        n5.right = n6;                          //             5
        n6.left=n7;                             //              \
        n6.right=n8;                            //               6
                                                //              /  \
                                                //             7    8

        System.out.println("There are "+CountNode(root)+ " node in a tree");

    }

    public static int CountNode(TreeNode root){
        if (root==null) return 0;               //  root is null return 0

        int LeftHeight = CountNode(root.left);
        int RightHeight = CountNode(root.right);

        return LeftHeight+RightHeight+1;
    }







}
