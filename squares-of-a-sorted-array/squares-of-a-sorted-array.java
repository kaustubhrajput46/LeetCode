class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;


        for(int i = 0; i < len; i++ ){
            nums[i] = nums[i] * nums[i];
        }
        
        for (int i = 0 ; i< len; i++){
            for (int j = 0; j < len - 1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}