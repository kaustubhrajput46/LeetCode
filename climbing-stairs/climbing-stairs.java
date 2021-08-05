class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n+1];
        return helper(n);
    }

    public int helper(int n){
        //first test if n is 0
        if (n == 0) return 1;
        
        //check in cache if already computed;
        if (cache[n] != 0 ) return cache[n];
            
        int res = 0;
        if (n>=1){
            if (cache[n-1] != 0 ) 
                res = res + cache[n-1];
            else 
                res = res + helper(n-1);
        }
        
        if (n>=2){
            if (cache[n-2] != 0 ) 
                res = res + cache[n-2];
            else 
                res = res + helper(n-2);
        }
        cache[n] = res;
        return res;
    }
}



//*** recursive solution with duplicate calls ***//
// class Solution {
//     //no if ways --- increment everytime leaf node is found! i.e. 0
//     int ways = 0;
//     public int climbStairs(int n) {
//         helper(n);
//         return ways;
//     }
    
    
//     public void helper(int n){
//         //first test if n is 0
//         if (n == 0) {
//             ways++;
//             return;
//         }
//         if (n>=1)  helper(n-1);
//         if (n>=2)  helper (n-2);
//         return;
//     }
// }