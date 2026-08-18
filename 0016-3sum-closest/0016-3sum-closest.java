class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int resultsum=0;
         
        int max =Integer.MAX_VALUE;
        
         for(int i=0 ;i< nums.length-2 ;i++){int left=i+1;
            int right= nums.length-1;


     while(left < right) {

            
            int sum = nums[i]+nums[left]+nums[right];

        
            int max_dif = Math.abs(sum - target);
                if(max_dif < max){
                    max = max_dif;

                    resultsum = sum;
                }
           
 
            if(sum == target){

                return sum;

            }else if(sum > target){

                right--;

            }else{

                left++;
            }
             }
         }

        return resultsum;
        
    }
}