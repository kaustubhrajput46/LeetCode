class Solution {
    public int maxSubArray(int[] nums) {
         //return recMax(nums,0,0);
        int acc =Integer.MIN_VALUE;
        int end = 0;
        for(int i =0; i<nums.length;i++){
           end = end + nums[i];
            if(acc<end)
                acc = end;
            if(end<0)
                end = 0;
            
        }
            return acc;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         // Initialize our variables using the first element.
//         int currentSubarray = nums[0];
//         int maxSubarray = nums[0];
        
//         // Start with the 2nd element since we already used the first one.
//         for (int i = 1; i < nums.length; i++) {
//             int num = nums[i];
//             // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
//             currentSubarray = Math.max(num, currentSubarray + num);
//             maxSubarray = Math.max(maxSubarray, currentSubarray);
//         }
        
//         return maxSubarray;
//     }
// }



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int max = nums[0];
//         for (int num : nums){
//             sum += num;
//             if (sum > max) max = sum;
//             if (sum < 0) sum = 0;
//         }
//         return max;
//     }
// }

// since we need to check all the combinations of subarrays to find the max
// let us proceed with brute force

// class Solution {
//     public int maxSubArray(int[] nums) {
//         // if(nums.length == 1) return nums[0];
//         int localMax, globalMax = nums[0], len = nums.length;
        
//         for(int i = 0; i< len-1; i++){
//             localMax = nums[i];
//             if(localMax > globalMax)  globalMax = localMax;            
//             for(int j = i+1; j < len; j++ ){
//                 localMax = localMax + nums[j];
//                 if(localMax > globalMax)  globalMax = localMax;
//             }
//         }
        
//         if(globalMax < nums[len - 1]) globalMax = nums[len - 1];
//         return globalMax;
//     }
// }