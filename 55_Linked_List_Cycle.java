/*
141. Linked List Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).


Example 2
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.



Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 
*/
//solution

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
      ListNode slow =  head, fast = head;

      while(fast != null && fast.next != null) {

          slow = slow.next;
          fast = fast.next.next;

      if(slow == fast) return true;
      }
      return false;
    }    
}
// Implementation 
  Example 1
Input:

head = [3, 2, 0, -4]
pos = 1 (This means the node with value 2 points back to itself, forming a cycle)
The list looks like this:


Copy code
3 -> 2 -> 0 -> -4
     ^           |
     |-----------|
Step-by-Step Execution
Initialization:

slow and fast are both initialized to head, which points to the node with value 3.
First Iteration:

slow = slow.next (moves one step forward)
slow now points to the node with value 2.
fast = fast.next.next (moves two steps forward)
fast now points to the node with value 0.
State:

rust
Copy code
slow -> 2
fast -> 0
Second Iteration:

slow = slow.next (moves one step forward)
slow now points to the node with value 0.
fast = fast.next.next (moves two steps forward)
fast now points to the node with value 2.
State:

rust
Copy code
slow -> 0
fast -> 2
Third Iteration:

slow = slow.next (moves one step forward)
slow now points to the node with value -4.
fast = fast.next.next (moves two steps forward)
fast now points to the node with value -4.
/*

The given code is an implementation of the Floyd's Tortoise and Hare algorithm to detect a cycle in a singly linked list. Here is the time complexity analysis of the `hasCycle` method:

### Time Complexity

The time complexity of this algorithm is \(O(n)\), where \(n\) is the number of nodes in the linked list. Here’s a step-by-step breakdown of how this complexity is determined:

1. **Initialization**: The algorithm initializes two pointers, `slow` and `fast`, both pointing to the head of the linked list. This takes constant time, \(O(1)\).

2. **Traversal**: The algorithm then enters a `while` loop, which continues until either `fast` becomes `null` or `fast.next` becomes `null`. In each iteration of the loop:
   - `slow` moves one step forward (`slow = slow.next`).
   - `fast` moves two steps forward (`fast = fast.next.next`).

   If there is no cycle, the `fast` pointer will reach the end of the list (i.e., `null`) in at most \(n\) steps. Since `fast` moves twice as fast as `slow`, the maximum number of iterations of the loop is \(O(n)\).

3. **Cycle Detection**: If there is a cycle, the `slow` and `fast` pointers will eventually meet within the cycle. The maximum number of iterations before they meet is also \(O(n)\) because in each step, the distance between `slow` and `fast` decreases by one.

### Space Complexity

The space complexity of this algorithm is \(O(1)\) because it uses only a constant amount of extra space (for the `slow` and `fast` pointers).

### Summary

- **Time Complexity**: \(O(n)\)
- **Space Complexity**: \(O(1)\)

The algorithm efficiently detects whether a cycle exists in a singly linked list by using two pointers moving at different speeds, ensuring linear time complexity and constant space complexity.*/
