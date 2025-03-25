class Solution {
    public int missingNumber(int[] nums) {

        int expectedSum=nums.length;
        int totalSum=0;

        for(int i=0;i<nums.length;i++)
        {
            expectedSum+=i;
            totalSum+=nums[i];
        }

        return expectedSum-totalSum;
        
        
        
    }
}