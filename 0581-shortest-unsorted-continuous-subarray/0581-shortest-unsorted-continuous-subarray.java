class Solution {
    public int findUnsortedSubarray(int[] nums) {

     
 
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;

     int f=0,l=nums.length-1;

    while(f < nums.length-1 && nums[f] <= nums[f+1]){
        f++;
    }

    
    while(l>0 && nums[l] >= nums[l-1]){
        l--;
    }

    if(f >= l){
        return 0;         
    }

    
     

    for(int i=f ; i<=l ; i++){

        if(nums[i] < min){
            min = nums[i];
        }

        if(nums[i] > max){
            max = nums[i];
        }

    }

    while(f>0 && nums[f-1] > min){
            
            f--;
    }

    while(l<nums.length-1 && nums[l+1] < max){
        l++;
    }
 
 return l-f+1;

    // || nums[i] == nums[i+1] | nums[j] == nums[j-1]

    //  while(i<j){

    //     if(nums[i] < nums[i+1]  ){
    //         i++;
    //     }else if(nums[j] > nums[j-1] ){
    //         j--;
    //     }else{

    //             for(int k=i ;k<=j ; k++){

    //                 if(nums[k] < min){
    //                     min =  nums[k];
    //                 }

    //                 if(nums[k] > max){
    //                     max = nums[k];
    //                 }
    //             }

    //         while(i>0 && nums[i-1] > min){
    //             i--;
    //         }
    //          while(j<nums.length-1 && nums[j+1] < max){
    //             j++;
    //         }

    //         // res = nums.length - ((min - i) + (j-max));

             

    //         return j-i+1;
    //     }
    //  }
    //     return 0;
        
    }
}