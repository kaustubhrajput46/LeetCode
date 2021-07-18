class Solution {
    public int removeElement(int[] nums, int val) {
// Using for loop
        // int length = nums.length;
        // for(int i = 0; i < length; i ++){
        //     if(nums[i] == val){
        //         //replacing the val with last element of array
        //         nums[i] = nums[length - 1];
        //         //decrement length as we dont want val in the last section
        //         length--;
        //         //decrement counter to check again from the same index as the new element might have value in it.
        //         i--;
        //     }
        // }
        // return length;
//Using while loop
        int len = nums.length;
        int i = 0;
        //parsing the aray
        while (i<len){
            if(nums[i] == val){
                //replacing the val with last element of array
                nums[i] = nums[len - 1];
                //decrement length as we are checking the len - 1 element in next iteration
                len--;
                //dont increment i here as replaced elemented also needs to be checked.
            }
            else i++;
        }
        return len;

    }
}
