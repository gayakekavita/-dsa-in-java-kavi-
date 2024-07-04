/*
  binary  tree is a tree where tree have at most two nodes.
  it can be less than two but not more than two childrens.

  problem description:
  226. Invert Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, invert the tree, and return its root. 
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []
  
*/
//solution
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right= left;
        return  root;
        
    }
}
