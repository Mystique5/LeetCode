class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int res=1, curr=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
                continue;
            if(nums[i]==nums[i-1]+1)
                curr++;
            else
                curr=1;
            
            res=Math.max(res,curr);
        }

        return res;
        
    }
}