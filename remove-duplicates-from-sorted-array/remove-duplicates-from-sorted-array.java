class Solution {
    public int removeDuplicates(int[] nums) {
        //variable to keep track of unique elements.
        // len is set as 1 as first element will always be unique.
        int len = 1;
        int numsLen = nums.length;
        //start 
        for(int i = 1; i < numsLen; i++){
            // if the ith element is diff than len - 1 th element, we got new unique element 
            if (nums[len - 1] != nums[i]){
                nums[len] = nums[i];
                len++;
            }
        }
        return len;
    }
}






// 1. len = 0  --increment len when unique element is found.