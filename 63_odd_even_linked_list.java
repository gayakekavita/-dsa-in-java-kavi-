/*
  328. Odd Even Linked List
Medium
Topics
Companies
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.


Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
*/

//solution :
time complexity
  /*
  The given code rearranges a singly linked list such that all the nodes at odd indices are grouped together followed by the nodes at even indices. Let's analyze its time complexity.

### Time Complexity Analysis

1. **Initialization**: The initial setup where variables `odd`, `even`, and `temp` are assigned takes constant time \(O(1)\).

2. **While Loop**: The loop runs as long as `even` and `even.next` are not null. Within each iteration of the loop:
   - `odd.next = even.next;` takes \(O(1)\) time.
   - `odd = odd.next;` takes \(O(1)\) time.
   - `even.next = odd.next;` takes \(O(1)\) time.
   - `even = even.next;` takes \(O(1)\) time.

   Since each iteration involves a constant amount of work and we traverse each node exactly once, the number of iterations of the loop is proportional to the number of nodes in the list, \(n\).

Therefore, the time complexity of the while loop is \(O(n)\), where \(n\) is the number of nodes in the linked list.

3. **Reconnecting**: After the loop, `odd.next = temp;` is executed, which takes \(O(1)\) time.

### Overall Time Complexity
Combining all the parts:
- Initial setup: \(O(1)\)
- While loop: \(O(n)\)
- Reconnecting: \(O(1)\)

The overall time complexity of the function is dominated by the while loop, which is \(O(n)\).

### Summary
The time complexity of the `oddEvenList` method is \(O(n)\), where \(n\) is the number of nodes in the linked list.
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode temp=even;
        while(even !=null && even.next!=null)
        {
            odd.next=even.next;
            odd =odd.next;
            even.next=odd.next;
            even=even.next;

        }
        odd.next=temp;
        return head;
        
    }
}


/* implementation for :
  Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

 1. odd=1
    even=2
    temp=2
 2. while(even!=null && even.next!=null)
     odd.next= even.next
             = 3     [odd= [1-->3]]
     odd= odd.next 
        = 3
     even.next=odd.next
              = 4  [even=[2-->4]]
     even=even.next
         = 4
  3. odd=3
     even=4

     odd.next=even.next
             =5  [odd=[1-->3-->5]]
      odd=odd.next
         =5
      even.next=odd.next
               =null [even=[2-->4-->null]]
      even =even.next
           =null


    4. odd=5
       even=null 
       here while looop will break because even is null .

    5. odd.next=temp
            [1-->3--->5-->temp]
            =[1-->3-->5-->2-->4-->null]
    6. return head
             [1-->3-->5-->2-->4]
*/
/*
Step-by-Step Explanation
Initialization:

odd points to the first node: 1.
even points to the second node: 2.
temp points to the second node: 2.
First Iteration:

odd.next = even.next makes the odd list: 1 -> 3.
Move odd to the next node: odd = 3.
even.next = odd.next makes the even list: 2 -> 4.
Move even to the next node: even = 4.
Second Iteration:

odd.next = even.next makes the odd list: 1 -> 3 -> 5.
Move odd to the next node: odd = 5.
even.next = odd.next makes the even list: 2 -> 4 (remains unchanged since odd.next is null).
Move even to the next node: even = null.
End of Loop:

Since even is null, exit the loop.
Connect the end of the odd list to the start of the even list: odd.next = temp (i.e., 5.next = 2).
Result:

The list is now rearranged to [1, 3, 5, 2, 4].

*/
