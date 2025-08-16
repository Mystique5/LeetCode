class Solution {
    public int hardestWorker(int n, int[][] logs) {

        if(logs.length==0)
            return 0;
        
        int resultId=logs[0][0];
        int maxTime=logs[0][1]-0;

        for(int i=1;i<logs.length;i++)
        {
            int time= logs[i][1] - logs[i-1][1];
            if(time ==maxTime)
                resultId= resultId < logs[i][0] ? resultId : logs[i][0];
            else if(time > maxTime)
            {
                maxTime=time;
                resultId=logs[i][0];
            }
        }
        return resultId;
    }
}