/*
Q257_Binary_Tree_Paths 
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str = new ArrayList<String>();
        if (root == null) return str;
        dfs(root, new StringBuilder(), str);
        return str;
    }
    
    public void dfs(TreeNode root, StringBuilder strB, List<String> lStr){
        if (root.left == null && root.right == null) {
            strB.append(root.val);
            lStr.add(strB.toString());
            return;
        }
        strB.append(root.val);
        strB.append("->");
        if (root.left != null) dfs(root.left, new StringBuilder(strB), lStr);
        if (root.right != null) dfs(root.right, new StringBuilder(strB), lStr);
    }
}