class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> pair=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(pair.containsKey(sc))
            {
                if(pair.get(sc)!=tc)
                    return false;
            }
            else if(pair.containsValue(tc))
                return false;
            
            pair.put(sc,tc);
        }

        return true;
    }
}