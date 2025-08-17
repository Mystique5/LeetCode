class Solution {
    public int firstMissingPositive(int[] nums) {
        //With Time : O(n) and space O(n)
       /* Set<Integer> seen=new HashSet<>();
        for(int num : nums)
        {
            if(num >0)
                seen.add(num);
        }
       
        int missing=1;

        while(seen.contains(missing))
            missing++;

        return missing;*/

        //With time O(n) and space O(1) --optimiized

        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i])
            {
                int temp=nums[i];
                nums[i] = nums[temp-1];
                nums[temp -1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i] != i+1)
                return i+1;
        }
        return n+1;
    }
}