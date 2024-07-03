-- if we have hierarchical data then we use tree data structure.
--when a node that do not have parent node is called as "root node" .
  # The root node is the topmost node in a tree data structure.
  # serving as the starting point from which all other nodes descend.
  # It has no parent and is the only node without a predecessor
  # In binary tree root node have two childes :
                             1.left node (left child)
                             2. right node (right child)
  # in Binary tree parent node have atmost "two" children not more than "two children" it can be less than "two" but not more than "two".
-- Preorder 
         types of traversal :
                1. Breadth first
                      # here we traverse tree horizontally.
                      # it is also known as "level" traversal.
                2. Depth First 
                      # here we traverse tree vertically .
                      # from top to bottom or vice versa .
                      # types of depth first traversal are:
                           1.preorder traversal (root----->left------>right)
                           2 .postorder traversal(left--------->right-------->root)
                           3. inorder traversal (left-------->root---------->right)


/*
Problem Description :
      144. Binary Tree Preorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
*/

//solution time complexity:
  The time complexity of the provided code for the `preorderTraversal` method is \(O(n)\), where \(n\) is the number of nodes in the binary tree.

Here's the detailed explanation:

1. **Traversal**: The code performs a preorder traversal of the binary tree. In preorder traversal, each node is visited once in the order: root, left subtree, and then right subtree.

2. **Recursive Calls**: For each node, the code makes recursive calls to visit the left and right subtrees. Since each node is visited exactly once, the total number of recursive calls is \(n\).

3. **Operations Per Node**: For each node, the code adds the node's value to the `res` list. This operation takes constant time, \(O(1)\).

Combining these points, the total time complexity is \(O(n)\) because the code visits each of the \(n\) nodes exactly once and performs a constant amount of work for each node.

Therefore, the overall time complexity of the `preorderTraversal` method is \(O(n)\).
  /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null) return res;

        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return res;
        
    }
}
/* implementation for :
   Input: root = [1,null,2,3]
   Output: [1,2,3]

   1. res=[]
   2. if root==null return null //state to false move to next
   3. res[1]
   4. preorderTraversal(2)
   5. res[1,2]
   6.preorderTraversal(3)
   7. res[1,2,3]
   8. return [1,2,3]
*/  
