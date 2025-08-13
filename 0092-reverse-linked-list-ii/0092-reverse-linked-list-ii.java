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
    public ListNode reverseBetween(ListNode head, int left, int right) {

       ListNode dummy=new ListNode(0);
       dummy.next=head;

       //marker for keeping the placeholders.
       ListNode preNode=dummy;
       ListNode curr=head;

       for(int i=1;i<left;i++)
       {
        preNode=preNode.next;
        curr=curr.next;
       }

       //marker for keeping the head of sublist
       ListNode subHead=curr;

        ListNode prev=null;
       for(int i=0;i<=right-left;i++)
       {
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
       }
        
        preNode.next=prev;
        subHead.next=curr;

        return dummy.next;


        
    }
}