class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length==1)
            return intervals;
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> ans=new Arraylist<>();

        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] < prev[1])
            {
                ans.add(new int[](prev[0],intervals[i][0]));
            }
        }
        
    }
}