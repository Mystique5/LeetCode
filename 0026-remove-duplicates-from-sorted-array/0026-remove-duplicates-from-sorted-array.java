class Solution {
    public int removeDuplicates(int[] nums) {

        int current=nums[0];
        int index=1;
        int i=1;

        while(i<nums.length)
        {
            if(nums[i]!=current)
            {
                nums[index]=nums[i];
                current=nums[i];
                index++;
            }
            i++;
        }

        return index;

        
    }
}