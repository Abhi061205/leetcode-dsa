class Solution {
    public void reverseString(char[] s) {

        int n = s.length;
        int i=0;
        int j=n-1;
        char temp;

        if(n % 2 == 0){

            while(i<j){

                temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;
            }


        }else{

            while(i<(n/2) && j>(n/2)){

                temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;

            }

        }
        
    }
}