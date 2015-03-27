/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> nodes1 = new Stack<TreeNode>();
        int depth = 0;
        if (root == null) return 0;
        depth =  getDepth(root, 1);
        return depth;
    }
    
    public int getDepth(TreeNode node, int depth){
        int right = depth, left = depth;
        if (node.left != null) left = getDepth(node.left, depth+1);
        if (node.right != null) right = getDepth(node.right, depth+1);
        return left > right ? left : right;
    }
}