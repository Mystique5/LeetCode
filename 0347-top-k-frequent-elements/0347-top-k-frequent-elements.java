class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(k==nums.length)
            return nums;

        Map<Integer, Integer> count=new HashMap<>();

        for(int num :nums)
        {
            count.put(num, count.containsKey(num) ? count.get(num)+1 : 1);
        }

        //System.out.println(count);

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> count.get(a) - count.get(b));
        for(int i : count.keySet())
        {
            pq.offer(i);
            if(pq.size()>k)
                pq.poll();
        }

        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll();
        }

        return result;
        
    }
}