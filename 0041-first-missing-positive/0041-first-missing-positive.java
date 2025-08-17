class Solution {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> seen=new HashSet<>();
        for(int num : nums)
        {
            if(num >0)
                seen.add(num);
        }
       
        int missing=1;

        while(seen.contains(missing))
            missing++;
            
        return missing;
    }
}