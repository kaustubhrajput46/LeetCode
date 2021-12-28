class Solution {

//First for loop is meant to exhaust one of the lists entirely
//later we check for the remaining list and add it to the end of the merge array
//    
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int one = nums1.length;
        int two = nums2.length;
        
        //merge array length will be summation of the length of given two lists
        int[] mergedNums = new int[one + two];
        int mergelen =  mergedNums.length;
        
        int x = 0, y = 0, k=0;

        //Exhaust one list completely
        for( int i=0; i <= mergelen; i++){
            if(x == one || y == two)
                break;
            if(nums1[x] <= nums2[y] ){
                mergedNums[i]= nums1[x];
                k++;
                x++;
            } else {
                mergedNums[i]= nums2[y];
                k++;
                y++;
            }            
        }
        
        // Exhaust the second list completely
        if(x == one)
            for(int i = k; y< two; i++){
                mergedNums[i] = nums2[y];
                y++;
            }
        if(y == two)
            for(int i = k; x< one; i++){
                mergedNums[i] = nums1[x];
                x++;
            }
        
        //return the median
        if(mergelen % 2 == 0){
            return (mergedNums[mergelen/2-1] + mergedNums[mergelen/2])/2.0;
        }
        else
            return mergedNums[(mergelen-1)/2];
    }
}




