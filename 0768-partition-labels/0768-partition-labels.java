class Solution {
    public List<Integer> partitionLabels(String s) {

        //int[] lastOcc=new int[26];
        List<Integer> result=new ArrayList<>();
        int len=s.length();

        int start=0, end=0;

        for(int i=0;i<len;i++)
        {
            end =Math.max(end , s.lastIndexOf(s.charAt(i)));
            if(i==end)
            {
                result.add(end-start+1);
                start=i+1;
            }
        }




        return result;

    }
}