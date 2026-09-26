class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        

        int sum =0;
        for(int i=0 ;i<nums.length ;i++){

            sum += nums[i];

        }

        int min = Integer.MAX_VALUE;
        int sum_min = 0;

        int max = Integer.MIN_VALUE;
        int sum_max = 0;

        for(int i=0 ;i<nums.length ;i++){

            sum_min += nums[i];

            if(sum_min < min){
                min = sum_min;
            }

            if(sum_min > 0){
                sum_min = 0;
            }

            sum_max += nums[i];

            if(sum_max > max){
                max = sum_max;
            }

            if(sum_max < 0){
                sum_max = 0;
            }
        }

        if(max < 0){
            return max;
        }

        int cir = sum - min;

        return  Math.max(max ,cir );
    }
}