class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        // if (nums == null || nums.length == 0) return 0;

        for(int i: nums){
            //check if element present
            //add if not present
            //remove if present
            if(hashSet.contains(i)) {
                hashSet.remove(i);
            }
            
            else {
                hashSet.add(i);
            }
                
        }
        
        return hashSet.iterator().next();

    }
}

// add elements if not present
// remove element if already present
// lastly hashSet should have only one element.