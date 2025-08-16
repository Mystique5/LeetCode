class Solution {
    public boolean findSubarrays(int[] nums) {

        Set<Integer> seen=new HashSet<>();
        int sum=0;

        for(int i=1;i<nums.length;i++)
        {
            sum=nums[i]+nums[i-1];
            if(seen.contains(sum))
                return true;
            seen.add(sum);
        }

        return false;
        
    }
}