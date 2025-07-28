class Solution {
    public int trap(int[] height) {

        int n=height.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        int total=0;

        for(int i=1, j=n-2;i<n && j>=0; i++, j--)
        {
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
            rightMax[j]=Math.max(rightMax[j+1],height[j]);
        }

        for(int i=0;i<n;i++)
        {
            total +=Math.min(leftMax[i], rightMax[i])-height[i];
        }

        leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // Fill rightMax
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    
        return total;
    }
}