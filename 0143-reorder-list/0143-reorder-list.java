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
    public void reorderList(ListNode head) {

        if(head.next==null) return;

        //Find the middle of the list
        ListNode slow=head, fast=head;

        while(fast !=null && fast.next!= null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        //Reverse from the middle;
        ListNode prev=null;
        ListNode curr=slow;

        while(curr!= null)
        {
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }

        //Now we merge 
        ListNode first=head , second=prev, temp;

        while(second.next!=null)
        {
            temp=first.next;
            first.next=second;
            first=temp;

            temp=second.next;
            second.next=first;
            second=temp;

        }

        


        
    }
}