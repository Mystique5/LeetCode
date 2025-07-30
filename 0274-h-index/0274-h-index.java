class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int n=citations.length;
        int h=0;

        for(int i=0;i<n;i++)
        {
            h=n-i;
            if(citations[i] >=h)
            {
                return h;
            }
        }
        return 0;
    }
}