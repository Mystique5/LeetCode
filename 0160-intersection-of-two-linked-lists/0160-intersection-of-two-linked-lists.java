/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currA=headA;
        ListNode currB=headB;
        
        //Calculating the length of both list 
        int lenA=getLength(headA);
        int lenB=getLength(headB);

        while(lenA > lenB)
        {
            currA=currA.next;
            lenA--;
        }
        while(lenB > lenA)
        {
            currB=currB.next;
            lenB--;
        }

        while(currA != currB)
        {
            currA=currA.next;
            currB=currB.next;
        }

        return currA;
        
    }

    private static int getLength(ListNode node)
    {
        int count=1;
        while(node !=null)
        {
            count++;
            node=node.next;
        }
        return count;
    }
}