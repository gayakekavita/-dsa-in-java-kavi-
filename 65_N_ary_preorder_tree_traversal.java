/*589. N-ary Tree Preorder Traversal
Easy
Topics
Companies
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 Example 1:
 Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]

Example 2:
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]

  */
-- N-ary tree:
     # N-ary is a tree in which a root can have multiple childrens .
     #  But in binary tree , tree in which root or parent node  have atmost two childrens not more than that it can be less but not more.
     # traversal means visiting each node of tree .
     # we can travese a tree in two ways :
                1.Breadth first search
                      -level order traversal
                2. Depth first search
                      - Preorder traversal 
                      - Postorder traversal
                      - Inorder traversal
  //solution 

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)return res;
        res.add(root.val);
        for(Node child: root.children)
        {
            preorder(child);
        }
        return res;
    }
}

//Time  complexity:
/*
The time complexity of the provided code for the `preorder` method in the `Solution` class is \(O(n)\), where \(n\) is the number of nodes in the N-ary tree.

Here's a detailed explanation:

1. **Traversal**: The code performs a preorder traversal of an N-ary tree. In preorder traversal, each node is visited once in the order: root, then all its children from left to right.

2. **Recursive Calls**: For each node, the code makes recursive calls to visit all of its children. Since each node is visited exactly once, the total number of recursive calls is \(n\).

3. **Operations Per Node**: For each node, the code adds the node's value to the `res` list and then iterates over all its children to make recursive calls. Adding the node's value to the list is an \(O(1)\) operation. Iterating over the children takes time proportional to the number of children, but since each node is visited exactly once, this iteration over children contributes to the overall \(O(n)\) complexity.

Combining these points, the total time complexity is \(O(n)\) because the code visits each of the \(n\) nodes exactly once and performs a constant amount of work for each node, plus iterating over each node's children.

Therefore, the overall time complexity of the `preorder` method is \(O(n)\).
*/
//implemenation
  1.res = []
  2.if (root == null) return res;
     This condition evaluates to false because root = 1
   3.res.add(root.val)
        res = [1]
   4.for (Node child : root.children)
        preorder(child)
         preorder(3)
  5.preorder(3)
    res.add(root.val)
    res = [1, 3]
  6.  for (Node child : root.children)
     preorder(child)
      preorder(5)
  7.preorder(5)
       res.add(root.val)
       res = [1, 3, 5]
  8.preorder(null)
    if (root == null) condition evaluates to true, so it returns res and goes back to the previous loop
  9.for (Node child : root.children)
   preorder(child)
   preorder(6)
  10.preorder(6)
     res.add(root.val)
      res = [1, 3, 5, 6]
  11.preorder(null)
   if (root == null) condition evaluates to true, so it returns res and goes back to the previous loop
  12. preorder(2)
     res.add(root.val)
     res = [1, 3, 5, 6, 2]
  13.preorder(null)
    if (root == null) condition evaluates to true, so it returns res and goes back to the previous loop
  14. preorder(4)
     res.add(root.val)
     res = [1, 3, 5, 6, 2, 4]
  15. preorder(null)
     if (root == null) condition evaluates to true, so it returns res


