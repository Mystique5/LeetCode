class Solution {
    public int subarraySum(int[] nums, int k) {

        int count=0;
        int sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1); // empty

        for(int i=0;i<nums.length ; i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum-k))
                count=count+map.get(sum-k);
            
            map.put(sum, map.containsKey(sum)? (map.get(sum) + 1) : 1);
        }

        return count;
        
    }
}