class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j = height.length-1;

        int max=0;
        int p=0;
        int min=0;
        int x=Integer.MIN_VALUE;

        while(i<j){

            if(height[i] > height[j]){
                p=j-i;
                min = height[j];
                j--;

                 max = p *min;

                if(max > x){
                    x = max;
                }

            }else if(height[i] < height[j]){
                p=j-i;
                min = height[i];
                i++;
                
                max = p *min;
                
                if(max > x){
                    x = max;
                }
            
            }else{

                p=j-i;
                min = height[i];   
                 max = p *min;
                

                if(max > x){
                    x = max;
                }
                i++;
            }
        }
        return x;
        
    }
}