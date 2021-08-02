class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
        
//         //create hashmap and move all the array elements into it.
//         Map<Integer, Integer> hashmap = new HashMap<>();
//         int i = 0;
//         for(int val : nums){
//             hashmap.put(i, val);
//             i++;
//         }
//         // for(Map.Entry<Integer, Integer> entrytemp: hashmap.entrySet()){
//         //     System.out.println(entrytemp.getKey()+"  "+entrytemp.getValue());
//         // }        
//         //iterate elements one by one in hashmap,
//         // check the keys of elements sum up to target!
//         // if yes, return their values!
//         // int a=0, b=0;
//         int[] res = new int[]{};
//         for(Map.Entry<Integer, Integer> entry: hashmap.entrySet()){
//             for(Map.Entry<Integer, Integer> subentry: hashmap.entrySet()){
//                 // ignore same element comparison
//                 if (entry.getKey() == subentry.getKey()) continue;
//                 if (entry.getValue() + subentry.getValue() == target){
//                     res = new int[]{subentry.getKey(), entry.getKey()};
//                     // a = entry.getKey();
//                     // b = subentry.getKey();

//                 }
//             }
            
//         }
//    return res;
//    // return new int[]{b,a};
    }

   //  public int[] twoSum(int[] nums, int target) {
   //      int a=0, b=0, len=nums.length;
   //      for (int i = 0 ; i < len; i++){
   //          for (int j = i+1; j <len; j++){
   //              if (nums[i] + nums[j] == target){
   //                  a = i;
   //                  b = j;
   //              }
   //          }
   //      }
   // return new int[]{a,b};
   //  }
}
