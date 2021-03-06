class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        
        for(int i = 0; i < len - 1; i++){
            if(prices[i+1] <= prices[i]) continue;
            for (int j = i+1; j < len; j++){
                if(prices[j] <= prices[i] && j<len-1) {
                    i=j;
                }
                else
                    if(prices[j] - prices[i] > max){
                        max = prices[j] - prices[i];
                    }
            }
        }
        return max;
    }
}


// O(n) solution

// class Solution {
//     public int maxProfit(int[] prices) {
//         int minprice = Integer.MAX_VALUE;
//         int maxprofit = 0;
//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] < minprice) {
//                 minprice = prices[i];
//             } else if (prices[i] - minprice > maxprofit) {
//                 maxprofit = prices[i] - minprice;
//             }
//         }
//         return maxprofit;
//     }
// }