/*
Q102_Binary_Tree_Level_Order_Traversal
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> l1 = new ArrayList<Integer>();
        if (root == null) return al;
        
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        current.add(root);
        
        while (!current.isEmpty()){
            TreeNode node = current.remove();
            
            if(node.left != null) next.add(node.left);
            if (node.right != null) next.add(node.right);
            l1.add(node.val);
            if(current.isEmpty()){
            current = next;
            next = new LinkedList<TreeNode>();
            al.add(l1);
            l1 = new ArrayList();
            }
        }
        return al;
    }
}