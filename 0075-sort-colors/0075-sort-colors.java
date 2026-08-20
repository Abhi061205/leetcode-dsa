class Solution {
    public void sortColors(int[] nums) {


        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){

             if(nums[mid] == 0){

                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

                //break;
             }else if(nums[mid] == 1){
                
                mid++;
                // break;
             }else if(nums[mid] == 2){

                int temp1 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp1;

                high--;
                // break;
             }
        }        
      
        //    for(int i=0 ;i<nums.length ;i++){
        //     int min =i;
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         if(nums[j] < nums[min]){
        //             min = j;
        //         }
        //     }
        //     int temp = nums[min];
        //     nums[min] = nums[i];
        //     nums[i] = temp;
        // }
    }

}