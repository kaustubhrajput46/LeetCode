class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int end = nums.length -1;
        int pivot = 0;
        int start = 0;
        while(start <= end){
            // System.out.println("start: "+start+" mid: "+mid+" end: "+end);
            pivot = (end + start)/2;
            if(nums[pivot] == target) return pivot;
            if(target > nums[pivot]){
                start = pivot+1;
            } else {
                end = pivot-1;
            }
        }
        
        return -1;
    }
}