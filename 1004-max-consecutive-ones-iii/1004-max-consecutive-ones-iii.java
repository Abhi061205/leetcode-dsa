class Solution {
    public int longestOnes(int[] nums, int k) {

        int zerocount=0;
        int maxcount=0;

        int i=0;

        for(int j=0 ;j<nums.length ;j++){

            if(nums[j] == 0){
                zerocount++;
            }

            while(zerocount > k){

                if(nums[i] == 0){
                    zerocount--;
                }

                i++;

            }

            maxcount = Math.max(maxcount , j-i+1);
        }

        return maxcount;































    //     int i = 0, j = 0;
    // while (i < nums.length) {
    //     k -= nums[i++] == 1 ? 0 : 1;
    //     if (k < 0) 
    //         k += nums[j++] == 1 ? 0 : 1;
    // }
    // return i - j;
    }
}