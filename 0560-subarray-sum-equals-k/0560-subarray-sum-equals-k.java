 class Solution {
    public int subarraySum(int[] nums, int k) {

       HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int need = sum - k;

            if(map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;








    //     int arr[] = new int[nums.length];

    //     int c = 0;

    //     arr[0] = nums[0];

    //     // if(k == arr[0]){
    //     //     c = 1;
    //     // }

    //     for(int i=1 ;i<nums.length ;i++){

    //         arr[i] = arr[i-1] + nums[i-1];

    //         }


    //     for(int i=0 ; i < nums.length ;i++){

    //         if(arr[i] == k){

    //             return i+1;
    //         }
    //     }

    // return c;



    //     int count=0;

    //     for(int i=0 ;i<nums.length ;i++){
    //         int sum =0;
    //         for(int j=i ;j<nums.length ;j++){
    //             sum = sum + nums[j];
    //             if(sum == k){
    //                 count ++;
    //             }
    //         }
    //     }
    // return count;
    }
}