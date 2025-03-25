class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Brute force approach
       /* int result[]=new int[nums.length];
        Arrays.fill(result, 0);

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i !=j && nums[i]>nums[j])
                {
                    result[i]++;
                }
            }
        }
         return result;*/

         //Optimised O(3N) method 

         int[] count=new int[101];
         int[] result=new int[nums.length];

         for(int i=0;i<nums.length;i++)
         {
            count[nums[i]]++;
         }

         for(int i=1;i<=100;i++)
         {
            count[i]+= count[i-1];
         }

         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]==0)
                result[i]=0;
            else
                result[i]=count[nums[i]-1];
         }

         return result;
        
    }
}