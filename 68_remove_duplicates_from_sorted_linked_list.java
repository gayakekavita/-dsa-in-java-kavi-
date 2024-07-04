-- in linked list there is memory pool of 100 then some space of memory is allocated to list.
  -- in linked list there no contious memory location like array.
  -- here we get address of first node .
  //solution
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
}
