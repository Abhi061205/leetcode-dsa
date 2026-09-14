class Solution {
    public int findDuplicate(int[] nums) {

        // BRUTE FORCE

        // Arrays.sort(nums);

        // int i=0;
        // // int j=i+1;

        // // if(nums.l)

        // while(i < nums.length){

        //     if(nums[i] == nums[i+1]){
        //          return nums[i];
        //     }

        //     i++;
        //     // j++;
        // }

        // return 0;



        int slow = 0;
        int fast = 0;

        while(true){

            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            while(slow == fast){

                slow = 0;

                while(slow != fast){

                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }

    
        
    }
}