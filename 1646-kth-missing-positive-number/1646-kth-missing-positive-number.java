class Solution {
    public int findKthPositive(int[] arr, int k) {

        int curr=1;
        int missing=0;
        int idx=0;

        while(true)
        {
            if(idx < arr.length && arr[idx]==curr)
                idx++;
            else
            {
                missing++;
                if(missing ==k)
                    return curr;
            }
            curr++;
        }
        
        

    }
}