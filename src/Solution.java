/**
 * Created by Sab3r on 2014/12/24.
 */
/**
 * Definition for binary tree

 IsHeightBalanced(tree)
 return (tree is empty) or
 (IsHeightBalanced(tree.left) and
 IsHeightBalanced(tree.right) and
 abs(Height(tree.left) - Height(tree.right)) <= 1)

 * }
 */
public class Solution {
    public static boolean isBalanced(TreeNode root) {
        return IsHeightBalanced(root);
    }

    private static boolean IsHeightBalanced(TreeNode root) {
        return (root == null) ||
                (IsHeightBalanced(root.left) &&
                IsHeightBalanced(root.right) &&
                Math.abs(height(root.left) - height(root.right)) <= 1);
    }


    private static int height(TreeNode node){
        if(node == null) return -1;

        return max(height(node.left),height(node.right)) + 1;
    }

    private static int max(int leftHeight, int rightHeight) {
        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }
}
