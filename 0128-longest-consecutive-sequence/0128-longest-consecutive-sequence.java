class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;
        int res=1;

        HashSet<Integer> numset=new HashSet<>();

        for(int n:nums)
            numset.add(n);
        
        for(int val : numset)
        {
            if(numset.contains(val-1))
                continue;
            else
            {
                int currentNum=val;
                int curr=1;
                while(numset.contains(currentNum+1))
                {
                    currentNum++;
                    curr++;
                }
                res=Math.max(res, curr);
            }
            
        }

        return res;
        
    }
}