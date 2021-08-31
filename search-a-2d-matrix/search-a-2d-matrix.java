class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSize = matrix.length, colSize = matrix[0].length;
        
        if (rowSize == 1)
            if (colSize == 1)
                if (matrix[0][0] == target ) return true;
            else return false;
        
        int startValue = 0, maxValue = colSize * rowSize;
        int pivot = -1;
        while(startValue < maxValue){
            if(pivot  == ((maxValue + startValue) / 2)) return false;
            pivot = (maxValue + startValue) / 2;
            System.out.println(startValue+"  "+maxValue);
            // int row = pivot/colSize, column = pivot%colSize;
            // System.out.println(row+" "+pivot+" "+column);
            System.out.println(matrix[pivot/colSize][pivot%colSize]);
            if(matrix[pivot/colSize][pivot%colSize] == target) return true;
            else if (matrix[pivot/colSize][pivot%colSize] > target){
                maxValue = pivot;
            } else {
                startValue = pivot;
            }
        }
        return false;
    }
}



// okay how am I approaching this :
// 1. get the maxValue : colSize * rowSize - 1
// 2. get the startValue:  0  == (0*0)
// istart = 0, jstart = 0;
// iend = rowSize, jend = colSize;

// pivot = (maxValue + startValue) /2 
// pivotVal = matrix[pivot/colSize][pivot%colSize]
// if pivotVal == target return true;
// else if pivot < target 
            // maxValue = pivot;
            // iend = pivot/colSize;
            // jend = pivot%colSize;





//         System.out.println(rowSize+" "+colSize);
//         if (rowSize == 1){
//             if (colSize == 1)
//                 if (matrix[0][0] == target ) return true;
//             if (colSize == 2){
//                 if (matrix[0][0] == target ) return true;
//                 if (matrix[0][1] == target ) return true;                
//             }
//             if (colSize == 3){
//                 if (matrix[0][0] == target ) return true;
//                 if (matrix[0][1] == target ) return true;
//                 if (matrix[0][2] == target ) return true;                
//             }
//             if (colSize == 4){
//                 if (matrix[0][0] == target ) return true;
//                 if (matrix[0][1] == target ) return true;
//                 if (matrix[0][2] == target ) return true;
//                 if (matrix[0][3] == target ) return true;                
//             }
//         }
//         if (rowSize == 2){
//             if (colSize == 1){
//                 if (matrix[1][0] == target ) return true;
//                 if (matrix[0][0] == target ) return true;
//             }
//             if (colSize == 2){
//                 if (matrix[0][0] == target ) return true;
//                 if (matrix[0][1] == target ) return true;                
//                 if (matrix[1][0] == target ) return true;
//                 if (matrix[1][1] == target ) return true;                
//             }
//         }
        
