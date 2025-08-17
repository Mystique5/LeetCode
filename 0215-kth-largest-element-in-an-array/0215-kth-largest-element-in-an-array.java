class Solution {
    public int findKthLargest(int[] nums, int k) {


return Arrays.stream(nums).boxed().sorted((a,b) -> Integer.compare(b,a)).skip(k-1).findFirst().get();


        
    }
}