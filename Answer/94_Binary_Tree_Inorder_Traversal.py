# Definition for a  binary tree node
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param root, a tree node
    # @return a list of integers
    def inorderTraversal(self, root):
        stack = []
        list = []
        node = root
        while (node != None) or (len(stack)>0):
            if node != None:
                stack.append(node)
                node = node.left
            else:
                node = stack.pop()
                list.append(node.val)
                node = node.right
        return list