class Solution {
    public List<List<Integer>> generate(int numRows) {
        // if (numRows == 0 ) return new ArrayList<List<Integer>>();
        List<List<Integer>> ptriangle = new ArrayList<>();
        //first row
//         List<Integer> row = new ArrayList<>();
//         row.add(1);
//         ptriangle.add(row);
//         if (numRows == 1 ) return ptriangle;
//         // row.clear();
//         row = new ArrayList<>();
//         row.add(1);
//         row.add(1);
//         ptriangle.add(row);
//         if (numRows == 2 ) return ptriangle;
        
//         System.out.println(ptriangle.get(1).get(0));
//         for(int i = 2; i < numRows; i++){
//             List<Integer> row = new ArrayList<>();
//             for(int j = 0; j < i+1; j++){
//                 row.add
//             }
            
            
//         }

        
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i) row.add(1);
                else {
                    row.add(ptriangle.get(i-1).get(j) + ptriangle.get(i-1).get(j-1));
                }
            }
            
            ptriangle.add(row);
        }

        
        return ptriangle;
    }
}