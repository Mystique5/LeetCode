class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen=new HashSet<>();

        for(int i : nums)
        {
            seen.add(i);
        }
        
        if(seen.size()!=nums.length)
            return true;
        
        return false;
    }
}