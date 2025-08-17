class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Map<Integer, Integer> temp=new HashMap<>();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i< nums2.length; i++)
        {
            while(!st.isEmpty() && nums2[i] > st.peek())
            {
                temp.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=temp.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}