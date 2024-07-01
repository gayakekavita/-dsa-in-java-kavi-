/*
234. Palindrome Linked List
Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 Example 1:


Input: head = [1,2,2,1]
Output: true


Example 2:
Input: head = [1,2]
Output: false
*/
//solution::
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(right.val != left.val){
                return false;
            }
            right = right.next;
            left = left.next;
        } 
        return true;
    }
}

//implementation
/*
Step-by-Step Execution
Check for Null or Single Node:

The code first checks if the head is null or if it contains only one node. Since neither condition is met, we move on.
Find the Middle of the List:

Initialize slow and fast pointers to head.
Move slow by one step and fast by two steps until fast reaches the end of the list.
rust
Copy code
Iteration 1:
slow -> 2
fast -> 2

Iteration 2:
slow -> 2
fast -> null
Now, slow points to the middle of the list.

Reverse the Second Half of the List:

Initialize curr to slow, prev to null, and next to null.
Reverse the list starting from the middle.
rust
Copy code
Iteration 1:
curr -> 2
prev -> null
next -> 1
curr.next -> prev

prev -> 2
curr -> 1

Iteration 2:
curr -> 1
prev -> 2
next -> null
curr.next -> prev

prev -> 1
curr -> null
Now, prev points to the head of the reversed second half of the list.

Compare the Two Halves:




Input: head = [1,2,2,1]
Output: true
ChatGPT
Let's go through the step-by-step implementation of the isPalindrome method for the input head = [1, 2, 2, 1] and verify that the output is true.

Input
head = [1, 2, 2, 1]
Step-by-Step Execution
Check for Null or Single Node:

The code first checks if the head is null or if it contains only one node. Since neither condition is met, we move on.
Find the Middle of the List:

Initialize slow and fast pointers to head.
Move slow by one step and fast by two steps until fast reaches the end of the list.
rust
Copy code
Initial state:
slow -> 1
fast -> 1

Iteration 1:
slow -> 2
fast -> 2

Iteration 2:
slow -> 2
fast -> null
Now, slow points to the middle of the list.

Reverse the Second Half of the List:

Initialize curr to slow, prev to null, and next to null.
Reverse the list starting from the middle.
rust
Copy code
Initial state:
curr -> 2
prev -> null

Iteration 1:
next -> 1
curr.next -> prev
prev -> 2
curr -> 1

Iteration 2:
next -> null
curr.next -> prev
prev -> 1
curr -> null
Now, prev points to the head of the reversed second half of the list.

Compare the Two Halves:

Initialize right to prev and left to head.
Compare the values of the nodes in the first half and the reversed second half.
sql
Copy code
Initial state:
right -> 1
left -> 1

Iteration 1:
right.val == left.val (1 == 1)
right -> 2
left -> 2

Iteration 2:
right.val == left.val (2 == 2)
right -> null
left -> 2
Since all values match and right becomes null, the list is a palindrome.
*/
