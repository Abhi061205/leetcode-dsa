class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i=0;
        int j=nums.length-1;
        int temp;

        

        while(i<=j){

            if(nums[i] == val){
                temp= nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            }else{
                i++;
            }
        }
        return i;
    }
}