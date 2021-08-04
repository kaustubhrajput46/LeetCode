class Solution {
    //data structure to store computed values
    int[][] cache;
    public List<Integer> getRow(int rowIndex) {
        // int size = rowIndex * ((rowIndex+1)/2);
        cache = new int[rowIndex+1][rowIndex+1];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++){
            list.add(helper(rowIndex, i));
        }
        return list;
    }
    
    public int helper(int i, int j){
        if(cache[i][j] != 0) return cache[i][j];
                
        int compute = 0;
        if(j == 0 || i == j || i == 0) 
            compute = 1;
        else {
            compute = helper(i-1, j-1) + helper(i-1, j);
            cache[i][j] = compute;
        }
        return compute;
    }
    
} 
    
    
