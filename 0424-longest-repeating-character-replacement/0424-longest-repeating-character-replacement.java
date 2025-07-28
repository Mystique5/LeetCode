class Solution {
    public int characterReplacement(String s, int k) {

        int freq[]=new int[26];
        int left=0;
        int ans=0;
        int maxOcc=0;

        for(int right=0; right<s.length();right++)
        {
           maxOcc=Math.max(maxOcc, ++freq[s.charAt(right)-'A']);
           if(right-left+1-maxOcc > k)
           {
            freq[s.charAt(left)-'A']--;
            left++;
           }

           ans=Math.max(ans, right-left+1);
        }
        return ans;
    }
}