class Solution {
    public String minWindow(String s, String t) {

        if(s.length() ==0 || t.length()==0 || t.length() > s.length())
            return "";
        
        Map<Character, Integer> mapT=new HashMap<>();

        for(char c : t.toCharArray())
        {
            mapT.put(c, mapT.getOrDefault(c,0)+1);
        }

        int left=0, right=0;
        int required=mapT.size();
        int created=0;
        int[] ans={-1,0,0};

        Map<Character, Integer> subS=new HashMap<>();
        while(right < s.length())
        {
            char c=s.charAt(right);
            subS.put(c, subS.getOrDefault(c, 0)+1);
            if(mapT.containsKey(c) && mapT.get(c).intValue()==subS.get(c).intValue())
            {
                created++;
            }
            while(left<=right && required==created)
            {
                c=s.charAt(left);
                if(ans[0]==-1 || ans[0]> right-left+1)
                {
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }
                subS.put(c, subS.get(c)-1);
                if(mapT.containsKey(c) && subS.get(c).intValue() < mapT.get(c).intValue())
                    created--;
                
                left++;
            }
            right++;
        }
        if(ans[0]==-1)
            return "";
        return s.substring(ans[1],ans[2]+1);
        
    }
}