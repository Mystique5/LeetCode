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

        if(head.next ==null)
            return true;
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second=reverseList(slow.next);
        fast=head;

        while(second!=null)
        {
            if(second.val != fast.val)
                return false;
            
            second=second.next;
            fast=fast.next;
        }

        return true;

        
    }
    private static ListNode reverseList(ListNode head)
    {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=null;
        ListNode curr=head;

        while(curr !=null)
        {
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;

        }

        return prev;
    }
}