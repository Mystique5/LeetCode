class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> pair=new HashMap<>();
        String[] str=s.split(" ");
        if(pattern.length() !=str.length)
            return false;
        int n=pattern.length();

        for(int i=0;i<n;i++)
        {
            char ch=pattern.charAt(i);
            String st=str[i];
            if(pair.containsKey(ch))
            {
                if(!pair.get(ch).equals(st))
                    return false;
            }
            else if(pair.containsValue(st))
                return false;
            
            pair.put(ch, st);
        }
        return true;
    }
}