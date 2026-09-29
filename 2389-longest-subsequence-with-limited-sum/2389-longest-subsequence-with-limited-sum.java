class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);

        int arr[] = new int [nums.length];
        int ans[] = new int [queries.length];

        int sum =0;

        for(int i=0 ;i<arr.length ;i++){

            sum = sum + nums[i];
            arr[i] = sum;
        }

        
        for(int i=0 ;i<queries.length ;i++){

            int count=0;

            for(int j=0 ;j<arr.length ;j++){
                
                if(arr[j] <= queries[i] ){
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}