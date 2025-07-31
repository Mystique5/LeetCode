class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result=new ArrayList<>();
        boolean inserted=false;

        for(int[] i:intervals)
        {
            if(i[1] < newInterval[0])
                result.add(i);
            else if(i[0] >newInterval[1])
            {
                if(!inserted)
                {
                    result.add(newInterval);
                    inserted=true;
                }
                result.add(i);
            }
            else{
                newInterval[0]=Math.min(i[0], newInterval[0]);
                newInterval[1]=Math.max(i[1], newInterval[1]);
            }
        }
        if(!inserted)
        result.add(newInterval);
        
        return result.toArray(new int[result.size()][2]);
    }
}