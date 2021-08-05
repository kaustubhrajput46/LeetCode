class Solution {
    public int pivotIndex(int[] nums) {
        //handle edge cases
        if (nums.length == 1) return 0;
        //Goal is to traverse pivot from left to right until left and right sums match!
        int pivot = 0;
        int lsum = 0;
        int rsum = 0 ;
        //we can traverse array to get the right sum 
        for(int x: nums) rsum = rsum + x;
        //when pivot = 0; if rsum = 0 return 0;
        if(rsum - nums[0] == 0) return 0;
        //pivot is 0, so rsum should not have nums[0] value in it.
        rsum = rsum - nums[0];
        
        //traverse nums to get the right pivot position
        for(pivot = 0; pivot < nums.length-1 ; pivot++){
            if (lsum == rsum) return pivot;
            
            //shift the pivot to right
            lsum = lsum + nums[pivot];
            rsum = rsum - nums[pivot+1];
        
        }
        //checking when pivot is the last element of an array
        if (lsum  == 0) return pivot;
        
        return -1;
    }
}