# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def inorder(self, root, solution):
        if root:
            self.inorder(root.left, solution)
            solution.append(root.val)
            self.inorder(root.right,solution)
    
    def inorderTraversal(self, root):
        solution = []
        self.inorder(root,solution)
        return solution



        
        
        