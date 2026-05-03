/*167. Two Sum II - Input Array Is Sorted
Medium
Topics
premium lock icon
Companies
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space. */
class Twosum {

    int[] twoSum(int[] numbers, int target) {
        
        //int next=1;

        int arr[] = new int[2];
      for(int i=0 ;i<numbers.length-1 ;i++){

        for(int next = i+1; next < numbers.length ; next++){

            if (numbers[i] + numbers[next] == target) {
                arr[0] = i+1;
                arr[1] = next+1;
            }
        }

      }

      return arr;  
    }

    public static void main (String[] args){
        int arr1[] = new int []{2,3,4};

        Twosum obj = new Twosum();
        int resultarr[] =  obj.twoSum(arr1,6);

        for(int i=0 ;i<resultarr.length ;i++){
            System.out.print(resultarr[i] + "  ");
        }
    }
    
    
}
