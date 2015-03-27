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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            while(nodes.peek().left != null){
                nodes.push(nodes.peek().left);
            }
            TreeNode current = nodes.pop();
            while (current.right == null){
                list.add(current.val);
                if (nodes.isEmpty())
                    return list;
                current = nodes.pop();
            }
            list.add(current.val);
            nodes.push(current.right);
        }
        return list;
    }
}