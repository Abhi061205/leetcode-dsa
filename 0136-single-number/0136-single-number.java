class Solution {
    public int singleNumber(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int ans= 0;

        while(i<=j){

             ans = ans ^ nums[i];

            i++;

        }
        
        return ans;
        
    }
}