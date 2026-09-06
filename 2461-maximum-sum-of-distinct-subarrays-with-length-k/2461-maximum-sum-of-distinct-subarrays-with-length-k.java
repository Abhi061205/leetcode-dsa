 class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
 
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
 
        if (map.size() == k) {
            maxSum = sum;
        }
 
        for (int j = k; j < nums.length; j++) {

          
            int old = nums[j - k];

            sum -= old;

            map.put(old, map.get(old) - 1);

            if (map.get(old) == 0) {
                map.remove(old);
            }
 
            int current = nums[j];

            sum += current;

            map.put(current, map.getOrDefault(current, 0) + 1);

         
            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}