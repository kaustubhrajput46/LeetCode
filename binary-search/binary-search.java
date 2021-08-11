class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int mid = len/2;
        int start = 0;
        int end = len -1;
        while(start <= end){
            System.out.println("start: "+start+" mid: "+mid+" end: "+end);
            if(nums[mid] == target) return mid;
            if(target > nums[mid]){
                start = mid+1;
                mid = (end + start)/2;
            } else {
                end = mid-1;
                mid = (end + start)/2;
            }
        }
        
        return -1;
    }
}