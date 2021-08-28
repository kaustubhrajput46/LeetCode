//since we need to check all the combinations of subarrays to find the max
//let us proceed with brute force

class Solution {
    public int maxSubArray(int[] nums) {
        int localMax, globalMax = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length-1; i++){
            localMax = nums[i];
            if(localMax > globalMax)  globalMax = localMax;            
            for(int j = i+1; j < nums.length; j++ ){
                localMax = localMax + nums[j];
                if(localMax > globalMax)  globalMax = localMax;
            }
        }
        
        if(globalMax < nums[nums.length - 1]) globalMax = nums[nums.length - 1];
        return globalMax;
    }
}