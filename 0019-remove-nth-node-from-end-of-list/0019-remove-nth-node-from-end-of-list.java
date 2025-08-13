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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null && n==1)
            return null;
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode front=dummy, back=dummy;

        for(int i=0;i<=n;i++){
            front=front.next;
        }

        while(front !=null)
        {
            front=front.next;
            back=back.next;
        }

        back.next=back.next.next;
        return dummy.next;
    }
}