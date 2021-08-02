class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            
        // // check if empty
        if (nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null) return new int[]{};
        //Use hashSet to store all unique and matching array elements.
        HashSet<Integer> hashSet = new HashSet<>();
        // It is enough to traverse shortest array
        if(nums1.length >= nums2.length){
            //store all elements of bigger array in a hashset
            Set<Integer> nums1Set = new HashSet<>();
            for(int i : nums1 ) nums1Set.add(i);

            //traverse smaller array and check matching element
            for(int i : nums2 ) {
                // System.out.println
                if(nums1Set.contains(i)) hashSet.add(i);
            }
        }
        else{
            //store all elements of bigger array in a hashset
            Set<Integer> nums2Set = new HashSet<>();
            for(int i : nums2 ) nums2Set.add(i);

            //traverse smaller array and check matching element
            for(int i : nums1 ) {
                if(nums2Set.contains(i)) hashSet.add(i);
            }

        }
        int[] result = new int[hashSet.size()];
        int i = 0;
        for (Integer num : hashSet) {
            result[i++] = num;
        }
        return result;
    }
}