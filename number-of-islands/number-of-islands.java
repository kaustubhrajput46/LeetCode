// Soution using HashSet to not revisit the node
class Solution {
    public int numIslands(char[][] grid) {         
        Set<Integer> set = new HashSet<>();
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //ignore values 0 in the grid -- either visited or were already 0;
                if(grid[i][j] == '1'){
                    islands++;
                    queue.offer(i*n+j);
                    set.add(i*n+j);
                    while(!queue.isEmpty()){
                        int node = queue.poll();
                        int x = node/n;
                        int y = node%n;
                        grid[x][y] = '0';
                        
                        if(x-1>=0 && y<n) {
                            if(!set.contains((x-1)*n+y))
                                if(grid[x-1][y] == '1'){
                                    queue.offer((x-1)*n+y);
                                    set.add((x-1)*n+y);
                                }
                        }
                        if(x<m && y-1>=0) {
                            if(!set.contains(x*n+(y-1)))
                                if(grid[x][y-1] == '1'){
                                    queue.offer(x*n+(y-1));
                                    set.add(x*n+(y-1));
                                }                            
                        }
                        if(x+1<m && y<n) {
                            if(!set.contains((x+1)*n+y))
                                if(grid[x+1][y] == '1'){
                                    queue.offer((x+1)*n+y);
                                    set.add((x+1)*n+y);
                                }
                        }
                        if(x<m && y+1<n) {
                            if(!set.contains(x*n+(y+1)))
                                if(grid[x][y+1] == '1') {
                                    queue.offer(x*n+(y+1));
                                    set.add(x*n+(y+1));
                                }
                        }
                    }
                    
                }
            }
        }
        return islands;
    }
}



// Without HashSet, this causes multiple visit to the same node, time limit exceeds

// class Solution {
//     public int numIslands(char[][] grid) {         
//         int m = grid.length;
//         int n = grid[0].length;
//         int islands = 0;
//         Queue<Integer> queue = new LinkedList<>();
//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 //ignore values 0 in the grid -- either visited or were already 0;
//                 if(grid[i][j] == '1'){
//                     islands++;
//                     // System.out.println(i+" "+j);
//                     queue.offer(i*n+j);
//                     while(!queue.isEmpty()){
//                         int node = queue.poll();
//                         int x = node/n;
//                         int y = node%n;
//                         grid[x][y] = '0';
//                         // if(x-1>=0 && y<n && (grid[x-1][y] == '1')) 
//                         //         queue.offer((x-1)*n+y);
                        
//                         if(x-1>=0 && y<n) {
//                             if(grid[x-1][y] == '1')
//                                 queue.offer((x-1)*n+y);
//                         }
//                         if(x<m && y-1>=0) {
//                             if(grid[x][y-1] == '1')                            
//                                 queue.offer(x*n+(y-1));
//                         }
//                         if(x+1<m && y<n) {
//                             if(grid[x+1][y] == '1')
//                                 queue.offer((x+1)*n+y);
//                         }
//                         if(x<m && y+1<n) {
//                             if(grid[x][y+1] == '1') 
//                                 queue.offer(x*n+(y+1));
//                         }
//                     }
                    
//                 }
//             }
//         }
//         return islands;
//     }
// }