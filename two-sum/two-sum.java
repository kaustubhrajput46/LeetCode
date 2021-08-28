class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            // if(nums[i] <= target){
            //     System.out.println(i);
                if(map.containsKey(target - nums[i])) 
                    if(i !=map.get(target - nums[i])) {
                        System.out.println("Hey");
                        return new int[]{i, map.get(target - nums[i])};
                    }
            // }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}