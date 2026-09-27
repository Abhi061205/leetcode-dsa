class Solution {
    public int largestAltitude(int[] gain) {
        
        int sum = 0;
         
        int max = Integer.MIN_VALUE;

        int arr[] = new int[gain.length+1];
        arr[0] = 0;


        for(int i=1 ;i<=gain.length ;i++){

                 
                
            arr[i] = arr[i-1] + gain[i-1];

            max = Math.max(max ,  arr[i]);

        }

        if(max < 0){
            return 0;
        }
        return max;
    }
}