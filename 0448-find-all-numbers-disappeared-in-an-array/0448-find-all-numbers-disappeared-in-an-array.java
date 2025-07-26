class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

       int n=nums.length;
       int i=0;

       while(i<n)
       {
        int correctPosition=nums[i]-1;
        if(nums[correctPosition] != nums[i])
        {
            int temp=nums[i];
            nums[i]=nums[correctPosition];
            nums[correctPosition]=temp;
        }
        else
            i++;
       }
       List<Integer> result=new ArrayList<>();

       for(int j=0;j<n;j++)
       {
        if(nums[j]!=j+1)
            result.add(j+1);
       }
        
        return result;
        
    }
}