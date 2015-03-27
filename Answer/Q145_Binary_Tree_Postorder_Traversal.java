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
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        if (cur == null)
            return list;
        while ((cur != null) || (!stack.isEmpty())){
            stack.push(cur);
            while (cur.left != null){
                cur = cur.left;
                stack.push(cur);
            }
            list.add(cur.val);
            cur = stack.pop();
            if (cur.right != null)
                list.add(cur.right.val);
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
}