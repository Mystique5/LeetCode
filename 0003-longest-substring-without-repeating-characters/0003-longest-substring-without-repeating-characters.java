class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s==null || s.length()==0)
            return 0;
        if(s.length() ==1)
            return 1;

        Set<Character> present=new HashSet<>();
        int maxLen=0;
        int left=0,right=0;

        while(right < s.length())
        {
            char ch=s.charAt(right);

            while(present.contains(ch))
            {
                present.remove(s.charAt(left));
                left++;
            }
            present.add(ch);
            maxLen=Math.max(maxLen , right-left+1);
            right++;
        }

        return maxLen;

        
    }
}