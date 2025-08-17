class Solution {
    public int findKthLargest(int[] nums, int k) {

//Java 8 solution with stream api.
//return Arrays.stream(nums).boxed().sorted((a,b) -> Integer.compare(b,a)).skip(k-1).findFirst().get();

    PriorityQueue<Integer> pq=new PriorityQueue<>();

    for(int num :nums)
    {
        pq.offer(num);
        if(pq.size() > k)
            pq.poll();
    }
    return pq.peek();
        
    }
}