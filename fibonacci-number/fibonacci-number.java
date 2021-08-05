class Solution {
    
//   HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
//     public int fib(int n) {
//         if (cache.containsKey(n)) {
//           return cache.get(n);
//         }
        
//         if (n == 0 ) return 0;
//         if (n == 1 ) return 1;
//         int result = fib(n-1) + fib(n-2);
        
//         cache.put(n, result);
//         return result;
//     }
    
    
    
    int[] cache;
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        cache = new int[n+1];
        // cache[1] = 1;
        return helper(n);
    }
    
    public int helper(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (cache[n] != 0) return cache[n];
        
        int res = helper(n-1) + helper(n-2);
        
        cache[n] = res; 
        return res;
        
    }

}