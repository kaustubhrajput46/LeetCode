class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;
        for (int i=0 ; i < ops.length; i++){
            if (ops[i][0] < row) 
                row = ops[i][0];
            if (ops[i][1]<col) 
                col = ops[i][1];
        }        
        return row*col;
        
    }
}





//exhaustive approach --- causes mem exceed issue
// class Solution {
//     public int maxCount(int m, int n, int[][] ops) {
        
//         if (ops.length == 0) return m*n;
//         if (ops.length == 1) return ops[0][0]*ops[0][1];
        
//         int[][] M = new int[m][n];
//         int res = 0;
        
//         //outer loop traverses ops
//         for(int i =0 ; i < ops.length; i++){
//             int a = ops[i][0];
//             int b = ops[i][1];
//             //row
//             for (int x = 0; x < a; x++){
//                 //column
//                 for(int y = 0; y < b; y++){
//                     M[x][y]+=1;
//                 }
//             }
//         }
//         int max = 0;
//         for (int x = 0; x < m; x++){
//             //column
//             for(int y = 0; y < n; y++){
//                 if (M[x][y] == max) res++;
//                 else if (M[x][y] > max) {
//                     res = 1;
//                     max = M[x][y];
//                 }
//             }
//         }
        
//         return res;
//     }
// }



