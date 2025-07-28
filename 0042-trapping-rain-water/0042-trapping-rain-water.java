class Solution {
    public int trap(int[] height) {

        int n=height.length;
        int water=0;

        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;

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

        return water;
        
    }
}