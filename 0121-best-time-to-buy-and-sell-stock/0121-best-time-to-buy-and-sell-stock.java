class Solution {
    public int maxProfit(int[] prices) {

        int i=0;
        int j=1;
        int max =0;

        while (j<prices.length){
            
            if(prices[i] > prices[j]){
                i++;
            }else if(prices[i]  < prices[j]){
                
                if((prices[j] - prices[i]) > max){
                    max = (prices[j] - prices[i]);
                }
                j++;
            }else{
                j++;
            }
        }

        if(max > 0){
            return max;
        }
        return 0;
    }
}