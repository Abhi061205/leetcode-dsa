class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);

        for(int i=0 ;i<n-2; i++){

           

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

             int l=i+1;
            int r=n-1;
            
            
            while(l<r){

                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i] ,nums[l] ,nums[r]));

                    while((l<r) && (nums[l] == nums[l+1]))l++;
                    while((l<r) && (nums[r] == nums[r-1])) r--;

                    l++;
                    r--;
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }

     return ans;   
    }
}
























// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {

//         List<List<Integer>> ans = new ArrayList<>();

//         Arrays.sort(nums);
//         int left;
//         int right;
//         int sum;
//         int n = nums.length;

//         for(int i=0 ;i<n-2 ;i++){

//             if(i>0 && (nums[i] == nums[i-1]))
//                 continue;

//             left = i+1;
//             right = n-1;
//             sum = -1 * nums[i];

//             while(left < right){

//                 int s = nums[left] + nums[right];
//                 if(s == sum){

//                     ans.add(Arrays.asList(nums[i] ,nums[left] ,nums[right]));

//                     left++;
//                     right--;
        

//                 while(left < n && (nums[left]==nums[left-1])){
//                     left++;
//                 }

//                 while(right >= 0 && (nums[right] == nums[right+1])){
//                     right--;
//                 }

//                 }else if(s< sum){
//                     left++;
//                 }else{
//                     right--;
//                 }
//             }
//         }

 
//  return ans;
//     }
// }