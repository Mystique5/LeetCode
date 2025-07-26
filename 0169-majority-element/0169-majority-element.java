class Solution {
    public int majorityElement(int[] nums) {

       Map<Integer, Integer> count=new HashMap<>();
       int majority=0;
       int result=nums[0];

       for(int num : nums)
       {
            count.put(num, count.getOrDefault(num, 0)+1);
            if(count.get(num) > majority)
            {
                majority++;
                result=num;
            }
        }

        return result;
    }
}