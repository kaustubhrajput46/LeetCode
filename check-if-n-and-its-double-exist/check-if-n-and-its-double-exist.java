class Solution {
    public boolean checkIfExist(int[] arr) {
        
        int len = arr.length;
        if (arr == null || len == 0) return false;
        //compare each element one by one
        for(int i = 0; i < len; i++){
            for(int j = i+1; j<len; j++){
                //check if valid pair exists
                if((arr[i] == 2 * arr[j]) || (arr[j] == 2 * arr[i]))
                    //found a valid pair
                    return true;
            }
        }
        //could not find a valid pair
        return false;
        
    }
}