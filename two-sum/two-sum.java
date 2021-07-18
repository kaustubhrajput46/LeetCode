class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0, b=0, len=nums.length;
        for (int i = 0 ; i < len; i++){
            for (int j = i+1; j <len; j++){
                if (nums[i] + nums[j] == target){
                    a = i;
                    b = j;
                }
            }
        }
   return new int[]{a,b};
    }
}