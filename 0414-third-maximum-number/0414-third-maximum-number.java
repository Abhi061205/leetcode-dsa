class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int i=nums.length;
        int count=1;

        if(nums.length < 3){
            return nums[nums.length-1];
        }else{  

             

            for(int j=nums.length-1 ; j>0 ;j--){
                
                if(nums[j] != nums[j-1]){
                    count++;
                }
                if(count == 3){
                    return nums[j-1];

                }
                
            }
            

            return nums[nums.length-1];
        }
        
    }
}