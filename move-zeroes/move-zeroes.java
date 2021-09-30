class Solution {
    public void moveZeroes(int[] nums) {
        int numsLen = nums.length;
        int len=0;
        for(int i=0; i<numsLen; i++){
            if(nums[i] != 0){
                nums[len] = nums[i];
                len++;
            }
        }
        while(len != numsLen){
            nums[len] = 0;
            len++;
        }
    }
}


