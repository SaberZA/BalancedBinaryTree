/**
 * Created by Sab3r on 2014/12/24.
 */
public class Driver {
    public static void main(String[] args){
        TreeNode binaryTree = CreateTree();
        boolean isBalanced = Solution.isBalanced(binaryTree);
        System.out.println(isBalanced);
    }

    private static TreeNode CreateTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        return root;
    }
}
