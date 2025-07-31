class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        LinkedList<int[]> result=new LinkedList<>();

        int newStart=newInterval[0];
        int newEnd=newInterval[1];
        int left=0, right=intervals.length;

        while(left < right && intervals[left][0] < newStart)
        {
            result.add(intervals[left]);
            left++;
        }

        int[] temp=new int[2];

        if(result.isEmpty() || result.getLast()[1] < newStart)
            result.add(newInterval);
        else
        {
            temp=result.removeLast();
            temp[1]=Math.max(temp[1],newEnd);
            result.add(temp);
        }
        while(left < right)
        {
            temp=intervals[left++];
            int start=temp[0];
            int end=temp[1];
            if(result.getLast()[1] < temp[0])
                result.add(temp);
            else
            {
                temp=result.removeLast();
                temp[1]=Math.max(temp[1],end);
                result.add(temp);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
}