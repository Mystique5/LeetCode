class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        
        int len1=nums1.length;
        int len2=nums2.length;
        int start=0, end=len1;

        while(start<=end)
        {
            int partX=(start+end)/2;
            int partY= (len1+len2+1)/2 - partX;

            int xLeft= partX==0 ? Integer.MIN_VALUE : nums1[partX-1];
            int xRight= partX==len1 ? Integer.MAX_VALUE : nums1[partX];
            int yLeft= partY==0 ? Integer.MIN_VALUE : nums2[partY-1];
            int yRight= partY==len2 ? Integer.MAX_VALUE : nums2[partY];

            if(xLeft <= yRight && yLeft <= xRight)
            {
                if((len1+len2)%2 ==0)
                    return (Math.max(xLeft,yLeft)+Math.min(xRight,yRight))/2.0;
                else
                    return Math.max(xLeft, yLeft);
            }
            else if(xLeft > yRight)
                end=partX-1;
            else
                start=partX+1;

        }

        return 0.0;
        
    }
}