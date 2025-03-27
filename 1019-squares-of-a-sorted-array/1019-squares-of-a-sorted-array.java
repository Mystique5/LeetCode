class Solution {
    public void reverse(int nums[])
    {
        int left=0;
        int right=nums.length-1;
        while(left <= right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public int[] sortedSquares(int[] nums) {

        int positiveInd=-1;
        int n=nums.length;

        for(int i=0; i<n;i++)
        {
            if(nums[i]>=0 && positiveInd==-1)
            {
                positiveInd=i;
            }

            nums[i]=nums[i]*nums[i];
        }

       System.out.println(Arrays.toString(nums));

        if(positiveInd==0)
            return nums;
        else if(positiveInd == -1)
        {
            reverse(nums);
            return nums;
        }

        int ans[]=new int[n];
        int k=0 ;
        int i=positiveInd;
        int j=positiveInd-1;

        while(j >=0 && i<n)
        {
            ans[k++]=(nums[i] <nums[j])? nums[i++]:nums[j--];
            // i++;
            // j--;
        }

        while(j>=0)
        {
            ans[k++]=nums[j--];
        }
        while(i<n)
        {
            ans[k++]=nums[i++];
        }

        return ans;


        



        
    }
}