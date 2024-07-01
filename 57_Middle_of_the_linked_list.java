/*
Problem::
876. Middle of the Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow, fast, new_head;
        slow = head;
        fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        new_head=slow;
        return new_head;
    }
}
/*
Let's go through the `middleNode` method to understand how it finds the middle node of a singly linked list and verify that it works for the input `head = [1, 2, 3, 4, 5]`.

### Explanation

1. **Initialization:**
   - Initialize `slow` and `fast` pointers to `head`.

2. **Finding the Middle Node:**
   - Use a while loop to move `slow` by one step and `fast` by two steps until `fast` reaches the end of the list or `fast.next` is `null`.
   - When `fast` reaches the end, `slow` will be at the middle node.

3. **Return the Middle Node:**
   - Assign the `slow` pointer to `new_head`.
   - Return `new_head`, which is the middle node of the list.

### Implementation


### Example

**Input:** `head = [1, 2, 3, 4, 5]`

### Step-by-Step Execution

1. **Initialization:**
   - `slow` -> 1
   - `fast` -> 1

2. **Finding the Middle Node:**

   ```
   Iteration 1:
   slow -> 2
   fast -> 3

   Iteration 2:
   slow -> 3
   fast -> 5

   Iteration 3:
   slow -> 3
   fast -> null
   ```

   After the iterations, `slow` points to the node with value 3, which is the middle node.

3. **Return the Middle Node:**
   - `new_head` -> 3
   - Return `new_head`

**Output:** The list starting from the middle node is `[3, 4, 5]`.

The implementation correctly finds the middle node of the linked list and returns it. For the input `head = [1, 2, 3, 4, 5]`, the middle node is `3`, and the output is `[3, 4, 5]`.*/
