class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length ==0)
            return new ArrayList();

        Map<String, List<String>> map=new HashMap<>();

        int count[]=new int[26];

        for(String str : strs)
        {
            Arrays.fill(count, 0);
            for(char c : str.toCharArray())
            {
                count[c-'a']++;
            }

            //String key= String.valueOf(count);
            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num).append("#");
            }
            String key = sb.toString();

            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}