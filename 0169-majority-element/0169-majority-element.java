class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hash=new HashMap<>();
        int result=0;
        int majority=0;

        for(int n : nums)
        {
            hash.put(n, 1+hash.getOrDefault(n,0));
            if(hash.get(n)>majority)
            {
                majority++;
                result=n;
            }
        }

        return result;

        
    }
}