class Solution {
    public int[] findArray(int[] pref) {

        /*XOR is reversible x=a^b then a=x^b
        so pref[i]= pref[i-1]^ arr[i], then 
        arr[i]= pref[i]^ pref[i-1];
        */

        int arr[]=new int[pref.length];
        arr[0]=pref[0];

        for(int i=1;i<pref.length;i++)
        {
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
        
        
    }
}