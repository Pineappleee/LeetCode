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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q != null){
            if (p.val == q.val && isSameTree(p.right,q.right) && isSameTree(p.left,q.left))
                return true;
            else
            return false;
        }
        else
            return false;
        
    }
}