class Solution {
    public boolean checkValidString(String s) {

        if(s.length()==1 && s.charAt(0)!= '*')
            return false;
        
        int minOpen=0;
        int maxOpen=0;

        for(char ch :s.toCharArray())
        {
            if(ch =='(')
            {
                minOpen++;
                maxOpen++;
            }
            else if(ch =='*')
            {
                minOpen--;
                maxOpen++;
            }
            else
            {
                minOpen--;
                maxOpen--;
            }
            if(maxOpen <0)
                return false;
            minOpen=Math.max(minOpen,0);
        }
        return minOpen==0;
    }
        
}