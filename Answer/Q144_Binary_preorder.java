/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        if (root == null)
            return re;
        adder(root,re);
        return re;
    }
    
    public void adder(TreeNode node, ArrayList list) {
        if (node == null)
            return;
        list.add(node.val);
        adder(node.left, list);
        adder(node.right, list);
    }
}