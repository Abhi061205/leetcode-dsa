import java.util.*;
class Solution {


    public int funSum(int n){

        int sum = 0;

        while(n > 0){

            int d = n % 10;
            n = n / 10;

            sum = sum + (d*d);
           
        }
         return sum;
    }

    public boolean isHappy(int n) {

        int slow =  n;
        int fast =  n;
         
        while(fast != 1){

        slow = funSum(slow);
        fast = funSum(fast);
        fast = funSum(fast);

        if(fast == slow && slow != 1){

            return false;
        }
    }

    return true;



    // public int sqofDigitSum(int n){
    //     int sum =0;

    //     while(n>0){

    //         int rem = n % 10;
    //         n /= 10;

    //         sum = sum + (rem * rem);
    //     }
    //     return sum;
    // }
    // public boolean isHappy(int n) {
    //     Set<Integer> set = new HashSet<>();

    //     while(n!=1){

    //         if(set.contains(n)){
    //             return false;
    //         }

    //         set.add(n);

    //         n =sqofDigitSum(n);

    //     }

    //     return true;
        
    }
}