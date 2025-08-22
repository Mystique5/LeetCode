class Solution {
    public int findMaxLength(int[] nums) {
    //O(n^2) solution ---
       /* int n=nums.length;
        int maxLen=0;

        for(int i=0;i<n ;i++)
        {
            int zeros=0, ones=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                    zeros++;
                else
                    ones++;

                if(zeros == ones)
                {
                    maxLen=Math.max(maxLen, j-i+1);
                }
            }

        }
        return maxLen;*/
    //Optimised 

       Map<Integer, Integer> map=new HashMap<>();
       map.put(0,-1);

       int preSum=0;
       int maxLen=0;

       for(int i=0;i<nums.length ;i++)
       {
            preSum += nums[i]==0 ? -1 : 1;
            if(map.containsKey(preSum))
            {
                maxLen=Math.max(maxLen, i- map.get(preSum));
            }
            else{
            map.put(preSum, i);
            }
       } 
        return maxLen;
    }
}