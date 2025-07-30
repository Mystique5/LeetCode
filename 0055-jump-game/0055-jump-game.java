class Solution {
    public boolean canJump(int[] nums) {
        int limit=nums.length -1 ;

        for(int i=nums.length-2 ; i>=0; i--)
        {
            if(i+nums[i] >= limit)
            {
                limit=i;
            }
        }

        return limit==0;
    }
}