class Solution {
    public int majorityElement(int[] nums) {

       Map<Integer, Integer> count=new HashMap<>();
       int majority=nums[0];

       for(int num : nums)
       {
            count.put(num, count.getOrDefault(num, 0)+1);
       }
       System.out.println(count);

        for(int key : count.keySet())
        {
            if(count.get(key) > nums.length/2)
                majority=key;
        }

        return majority;
    }
}