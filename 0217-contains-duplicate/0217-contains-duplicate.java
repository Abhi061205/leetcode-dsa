class Solution {
    public boolean containsDuplicate(int[] nums) {
 

        int i=0;
        int j=nums.length-1;

        Arrays.sort(nums);

        while(i<j){
            if(nums[i] == nums[i+1]){
                return true;
            }
            i++;
        }

        return false;
    }
}