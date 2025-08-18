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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;

        ListNode curr=head;
        int count=1;

        //Counting the no of nodes and also in the end curr will point to the last node
        while(curr.next !=null)
        {
            curr=curr.next;
            count++;
        }

        //Checking if k is a multiple of count, if so then after rotation same list will be formed , hence return the same list. 
        if(k%count ==0)
            return head;

        //if not the make the list circular
        curr.next=head;
        k= k%count; // take out the no of times we have to rotate.
        curr=head; //now point to head and traverse till the new (head-1)th node
        for(int i=0;i<count-k-1;i++)
        {
            curr=curr.next;
        }
        head=curr.next; // make the new head 
        curr.next=null; // break the circle

        return head;
        
    }
}