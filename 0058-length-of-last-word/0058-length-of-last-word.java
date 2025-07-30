class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] str=s.split(" ");
        int n=str.length-1;
        while(str[n]==" ")
            n--;
        
        int len=str[n].length();
        return len;
    }
}