class Solution {
    public int removeElement(int[] nums, int val) {

        int start=0;
        int end=nums.length-1;
        int count=0;

        while(start<=end)
        {
            if(nums[start]==val)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=nums[start];
                end--;
                count++;
            }
            else
                start++;
        }

        return nums.length-count;
        
    }
}