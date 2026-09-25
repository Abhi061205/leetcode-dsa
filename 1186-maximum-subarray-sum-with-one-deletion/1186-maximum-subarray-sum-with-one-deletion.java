class Solution {
    public int maximumSum(int[] arr) {


        int power =arr[0];
        int nopower = arr[0];
        int res = arr[0];

        for(int i=1 ;i<arr.length ;i++){

            int v1 = arr[i];
            int v2 = nopower + arr[i];
            int v3 = power + arr[i];
            int v4 = nopower;

            int newNoPower = Math.max(v1, v2);
            int newPower = Math.max(v3, v4);

            res = Math.max(res, Math.max(newNoPower, newPower));

            nopower = newNoPower;
            power = newPower;
        }


        return res;







        // int sum = 0;
       
        // Arrays.sort(arr);

        // for(int i=0 ;i<arr.length ;i++){

        //     sum = sum + arr[i];

        // }

        // // return sum-arr[0];

        // int max = sum;

        // for(int i=0 ;i<arr.length ;i++){

        //     int a = sum - arr[i];


        //     if( a > sum ){
        //         max = a;
        //     }
        // }
        // return max;
        
    }
}