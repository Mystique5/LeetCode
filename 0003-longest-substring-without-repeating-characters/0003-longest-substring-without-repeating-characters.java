class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null || s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;

        int left=0, right=0;
        int ans=0;

        Set<Character> seen=new HashSet<>();

        while(right <s.length())
        {
            char ch=s.charAt(right);
            while(seen.contains(ch) && !seen.isEmpty())
            {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(ch);
            ans=Math.max(ans, right-left+1);
            right++;
        }

        return ans;
        
    }
}