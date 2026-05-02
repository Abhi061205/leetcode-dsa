

class movezero {
    public void moveZeroes(int[] nums) {
        int temp;
        int x = nums.length;
        
        int l =0;


        for (int r=0;r<x ;r++){

            if(nums[r] != 0){
                temp  = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;

                l++;

            }
           }
       }
    public static void main(String[] args){
        int[] arr = new int[]{0,1,0,3,12};

        Solution solution = new Solution();
        solution.moveZeroes(arr);

        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
