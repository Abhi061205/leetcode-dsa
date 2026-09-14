class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        int i=0;
        int j=i+1;

        // if(nums.l)

        while(i < nums.length){

            if(nums[i] == nums[j]){
                 return nums[j];
            }

            i++;
            j++;
        }

        return 0;
        
    }
}