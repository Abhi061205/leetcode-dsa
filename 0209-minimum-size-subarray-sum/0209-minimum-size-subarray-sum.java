class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        int high=0;
        int low = 0;
        int sum = 0;

        while(high < nums.length){

            sum = sum + nums[high];

            while(sum >= target){

                int len = high - low + 1;

                if(len < min){
                    min = len;
                }

                sum = sum - nums[low];
                low++;
            }
            high++;

        }

        if(min <= target)
        return min;
        else
        return 0;
    }
}