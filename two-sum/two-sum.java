
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int len = nums.length;
        
        for(int i = 0; i < len; i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else
                map.put(nums[i], i);
            
        }
        
        
        // for(int i : nums){
        //     if(map.contains(target - i))
        //         return new int[]{i, target - i};
        //     else
        //         map.add(i);
        // }
        return new int[]{0,0};
    }
}












































// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i< nums.length; i++){
//             if(i !=map.getOrDefault(target - nums[i], i))
//                 return new int[]{i, map.get(target - nums[i])};
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i< nums.length; i++){
//             if(map.containsKey(target - nums[i])) 
//                 if(i !=map.get(target - nums[i])) {
//                     return new int[]{i, map.get(target - nums[i])};
//                 }
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }