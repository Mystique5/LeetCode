class Solution {
    public int trap(int[] height) {

        //Approach 2
       /* int n=height.length;
        int water=0;

        int left=0;
        int right=n-1;
        int leftMax=height[0];
        int rightMax=height[right];

        while(left < right)
        {
            if(height[left] < height[right])
            {
                leftMax=Math.max(leftMax, height[left]);
                if(leftMax-height[left] >0)
                {
                    water +=leftMax-height[left];
                }
                left++;
            }
            else
            {
                rightMax=Math.max(rightMax, height[right]);
                if(rightMax-height[right] >0)
                {
                    water +=rightMax- height[right];
                }
                right--;
            }
        }

        return water;*/

        int n=height.length;

        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=height[0];
        right[n-1]=height[n-1];

        int water=0;

        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1], height[i]);
        }

        for(int j=n-2 ; j>=0;j--)
        {
            right[j]=Math.max(right[j+1], height[j]);
        }

        for(int i=0;i<n;i++)
        {
            water +=Math.min(left[i],right[i])-height[i];
        }

        return water;
        
    }
}