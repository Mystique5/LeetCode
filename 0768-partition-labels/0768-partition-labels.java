class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] lastOcc=new int[26];
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            lastOcc[s.charAt(i)-'a']=i;
        }
        int endPartition=0;
        int startPartition=0;

        for(int i=0;i<s.length();i++)
        {
            endPartition=Math.max(endPartition, lastOcc[s.charAt(i)-'a']);
            if(i==endPartition)
            {
                result.add(endPartition-startPartition+1);
                startPartition=i+1;
            }
        }
        return result;
        
    }
}