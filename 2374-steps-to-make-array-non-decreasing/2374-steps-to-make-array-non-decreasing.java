class Solution {
    public int totalSteps(int[] nums) {
        
        int steps=0;
        int ans=0;
        Stack<int[]> st=new Stack<int[]>();

        for(int i=nums.length-1 ; i>=0;i--)
        {
            steps=0;

            while(!st.isEmpty() && nums[i] > st.peek()[0])
            {
                int[] temp=st.pop();
                steps = Math.max(steps+1 , temp[1]);
            }

            ans=Math.max(ans, steps);
            st.push(new int[]{nums[i], steps});
        }
        return ans;
    }
}