/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head ==null)
            return null;

        //make new nodes and attach in the middle of nodes.

        Node curr=head;

        while(curr!=null)
        {
            Node newNode=new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }

        //Copy random_indexes in the new nodes
         curr=head;
         while(curr!=null)
         {
            if(curr.random!=null)
                curr.next.random=curr.random.next;
            curr=curr.next.next;
         }
        
        //Seperate both the lists;
        curr=head;
        Node newHead=head.next;
        Node newCurr=newHead;

        while(curr!=null)
        {
            curr.next=newCurr.next;
            curr=curr.next;
            if(curr!=null){
                newCurr.next=curr.next;
                newCurr=newCurr.next;
            }
        }

        return newHead;
    }
}