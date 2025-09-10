class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] lastOcc=new int[26];
        List<Integer> result=new ArrayList<>();
        int len=s.length();

        for(int i=len-1 ; i>= 0;i--)
        {
            if(lastOcc[s.charAt(i) -'a']==0)
                lastOcc[s.charAt(i) -'a'] =i;
        }
        int start=0, end=0;

        for(int i=0;i<len;i++)
        {
            end=Math.max(end, lastOcc[s.charAt(i) - 'a']);
            if(i==end)
            {
                result.add(end-start+1);
                start=i+1;
            }
        }

        return result;

    }
}