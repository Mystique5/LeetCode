class Solution {
    public int removeDuplicates(int[] nums) {

       int prev=0;
       //int curr=1;
       int index=1;

       for(int i=1;i<nums.length;i++)
       {
        if(nums[i] != nums[prev])
        {
            nums[++prev]=nums[i];
            index++;
        }
        //curr++;
       }

        return index;
    }
}