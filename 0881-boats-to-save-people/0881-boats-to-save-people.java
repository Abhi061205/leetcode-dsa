class Solution {
    public int numRescueBoats(int[] people, int limit) {
        

        int i=0;
        int j=people.length-1;
        int count=0;
        int sum = 0;

        Arrays.sort(people);

        while(i <= j){
            
            sum =  people[i] + people[j];

            if( sum <= limit ){
               
                j--;
                i++;
              
            }else if( sum > limit){
                sum = sum - people[j];
                j--;
                sum =0;

            }
             count++;
        }

        return count;
    }
}