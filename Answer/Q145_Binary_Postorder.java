public class Solution{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root != null)
            return postorder(root,list);
        else 
            return list;
    }
    
    public List<Integer> postorder(TreeNode root, List list){
        if (root.left != null)
            postorder(root.left,list);
        if (root.right != null)
            postorder(root.right,list);
        list.add(root.val);
        return list;
    }
}