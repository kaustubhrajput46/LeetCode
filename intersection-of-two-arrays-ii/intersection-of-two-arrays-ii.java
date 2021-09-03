class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
        //     return new int[]{};
        List<Integer> res = new ArrayList<>();
        for(int j = 0; j< nums1.length; j++){
            for(int k = 0; k < nums2.length; k++){
                
                if(nums1[j] == nums2[k]){
                    res.add(nums1[j]);
                    nums2[k] = -1;
                    nums1[j] = -2;
                    continue;
                }
                
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for(int x : res) {
            arr[i] = x;
            i++;
        }
        return arr;
    }
}