class LRUCache {
    private static class Node{
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val)
        {
            this.key=key;
            this.val=val;
        }
    }
    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Node newNode=map.get(key);
        System.out.println(newNode.key+"  "+newNode.val);
        remove(newNode);
        insertAtHead(newNode);
        return newNode.val;        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node temp=map.get(key);
            temp.val=value;
            remove(temp);
            insertAtHead(temp);
        }
        else{
            if(map.size()==capacity)
            {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode=new Node(key, value);
            map.put(key, newNode);
            insertAtHead(newNode);
            
        }
    }

    private void remove(Node node)
    {
        System.out.println( node.prev.key +"  "+node.prev.val);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insertAtHead(Node node)
    {
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */