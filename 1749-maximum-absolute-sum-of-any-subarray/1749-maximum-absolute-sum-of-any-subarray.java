class Solution {

    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0 ;i< nums.length ;i++){

            sum = sum + nums[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
        
    }
     public int minSubarraySum(int[] arr) {
        // code here
        
        int sum =0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ;i<arr.length ;i++){
            
            sum = sum + arr[i];
            
            if(sum < min){
                min = sum;
            }
            
            if(sum > 0){
                sum = 0;
            }
        }
        
        return min;
    }
    public int maxAbsoluteSum(int[] nums) {
        
        int a = maxSubArray(nums);
        int b = minSubarraySum(nums);


        int c = Math.max(a , (-b));

        return c;
    }
}