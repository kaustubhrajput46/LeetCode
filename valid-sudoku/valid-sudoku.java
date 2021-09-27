class Solution {
    public boolean isValidSudoku(char[][] board) {
        char dot = '.';
        Set<Integer> set = new HashSet<>();
        //check rows
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == dot) continue;
                if(set.contains(board[i][j] - '0')) return false;
                else set.add(board[i][j] - '0');
            }
            set.clear();
        }
        //check columns
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[j][i] == dot) continue;
                if(set.contains(board[j][i] - '0')) return false;
                else set.add(board[j][i] - '0');
            }
            set.clear();
        }
        for(int k = 0; k < 9; k=k+3){
            set.clear();
            for(int i = 0; i < 9; i++){
                for(int j = k; j < k+3; j++){
                    if(board[i][j] == dot) continue;
                    if(set.contains(board[i][j] - '0')) return false;
                    else set.add(board[i][j] - '0');        
                }
                //clear set after every 1 interations
                if(i == 2 || i == 5) set.clear();
            }
        }

        
        return true;
    }
}