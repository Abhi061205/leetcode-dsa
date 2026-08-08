 class Solution {
    public int[] productExceptSelf(int[] nums) {

        int arrl[] = new int[nums.length];
        int arrf[] = new int[nums.length];
        int ans[] = new int[nums.length];

        arrl[0] =1;
        arrf[nums.length-1] = 1;

        int p1=1;
        int p2=1;


        for(int i=1; i<arrl.length ;i++){
            p1= p1 * nums[i-1];
            arrl[i] = p1 ;
        }

        for(int i=arrl.length-2 ; i>=0 ;i--){
            p2 = p2 * nums[i+1];
            arrf[i] = p2 ;
        }

        for(int i=0;i<nums.length ;i++){

            ans[i] = arrl[i] * arrf[i];

        }

        return ans;

    }
 }