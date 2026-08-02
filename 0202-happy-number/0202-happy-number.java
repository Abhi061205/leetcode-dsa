import java.util.*;
class Solution {

    public int sqofDigitSum(int n){
        int sum =0;

        while(n>0){

            int rem = n % 10;
            n /= 10;

            sum = sum + (rem * rem);
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n!=1){

            if(set.contains(n)){
                return false;
            }

            set.add(n);

            n =sqofDigitSum(n);

        }

        return true;




        
    }
}