class Solution {
    public int countBinarySubstrings(String s) {

        int count=0, prev=0, curr=1, idx=1;

        while(idx < s.length())
        {
            if(s.charAt(idx) != s.charAt(idx-1))
            {
                count +=Math.min(prev, curr);
                prev=curr;
                curr=1;
            }
            else
                curr++;
            idx++;
        }
        return count +=Math.min(prev,curr);
    }
}