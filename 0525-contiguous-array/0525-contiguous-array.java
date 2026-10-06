class Solution {
    public int findMaxLength(int[] nums) {

  if (nums == null || nums.length == 0) { // Base Case
      return 0;
    }
        int n=nums.length;
        for(int i=0 ;i<n ;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        int sum =0;
        int maxlength = 0;

        Map<Integer , Integer> map = new HashMap<>();

        map.put(0 , -1);

        for(int i=0 ;i<n ;i++){
             
             sum += nums[i];

             if(map.containsKey(sum)){

                int last = map.get(sum);
                maxlength = Math.max(maxlength , i-last);
             }else{
                map.put(sum , i);
             }
        }

        return maxlength;
    }
}