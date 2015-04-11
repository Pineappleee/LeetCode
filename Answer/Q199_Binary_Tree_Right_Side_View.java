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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lookup = new ArrayList<Integer>();
        List<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp = new TreeNode(-1);
        if (root == null)
            return lookup;
        else {
            queue.add(root);
            while (queue.size() != 0){
                int size = queue.size();
            for (int i=0; i<size;i++){
                temp = queue.get(0);
                queue.remove(0);
                if (i==0){
                    lookup.add(temp.val);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
                if (temp.left != null){
                    queue.add(temp.left);
                }
            }   
        }
        }
        return lookup;
    }
}