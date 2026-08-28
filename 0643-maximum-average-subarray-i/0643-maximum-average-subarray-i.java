class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i=0;
        int j=k;

        int sum =0;
        
        for(int l=0 ;l<k ;l++){

            sum = sum + nums[l];

        }

        int max = sum;


        while(j < nums.length){

            sum = sum - nums[i];
            i++;

            sum = sum + nums[j];
            j++;

            if(sum > max){
                max =sum;
            }
        }

      return (double) max/k;  
    }
}