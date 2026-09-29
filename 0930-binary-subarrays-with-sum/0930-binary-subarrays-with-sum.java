class Solution {
     public int numSubarraysWithSumAtmostK(int[] nums, int goal){

        int sum =0;
        int start = 0;
        int count =0;
        int n = nums.length;


        for(int end =0 ;end < n ;end++){

            sum = sum + nums[end];

            while(start <= end && sum > goal){

                sum -= nums[start];
                start++;
            }

            count += end - start +1;
        }

return count;
     }
    public int numSubarraysWithSum(int[] nums, int goal) {


            return (numSubarraysWithSumAtmostK(nums, goal) - numSubarraysWithSumAtmostK( nums, goal-1));


    }
}

    //     int sum = 0;
    //     int s = 0,count=0,e=0;
    //     int n = nums.length;

    //     while( e<n ){
            
    //         sum = sum + nums[e];

    //         if(sum == goal){
    //             count++;
    //         }

    //         if(  sum > goal){

    //             sum -= nums[s];
    //             s++;
    //         }

    //          if(sum == goal){
    //             count++;
    //         }
    // e++;
             
    //     }

       
    //     return count;
        
//     }
// }