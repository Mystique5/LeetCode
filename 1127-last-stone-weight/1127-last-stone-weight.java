class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);

        for(int num : stones)
        {
            pq.offer(num);
        }
        while(pq.size()>1)
        {
            pq.offer(pq.poll()-pq.poll());
        }
        return pq.poll();
        
    }
}