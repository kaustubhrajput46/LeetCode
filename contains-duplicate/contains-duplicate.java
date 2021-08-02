class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Add all unique elements in the hashSet.
        Set<Integer> hashSet = new HashSet<>();
        
        int len = nums.length;
        //Traverse array and check all the elements one by one
        for(int i=0; i<len; i++ ){
            //check if element is present
            //if yes, return true; else add the element
            if(hashSet.contains(nums[i])) return true;
            else hashSet.add(nums[i]);
        }
        
        //reached end of array without finding any duplicate.
        return false;
    }
}