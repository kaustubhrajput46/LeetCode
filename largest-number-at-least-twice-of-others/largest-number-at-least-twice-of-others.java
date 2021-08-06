class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        //maybe check if [0] present ... might need to return -1
        int index = -1, maxVal=0, max2Val = 0,  TwiceSecondLargest = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxVal){
                max2Val = maxVal;
                maxVal = nums[i];
                index = i;
            } else {
                if(nums[i] > max2Val) max2Val = nums[i];
            }
            if (TwiceSecondLargest < 2*max2Val) TwiceSecondLargest = 2*max2Val;
        }
        
        if (TwiceSecondLargest <= maxVal) return index;
        else return -1;
        //
    }
}