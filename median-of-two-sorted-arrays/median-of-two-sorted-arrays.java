class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int one = nums1.length;
        int two = nums2.length;
        int[] mergedNums = new int[one + two];
        int mergelen =  mergedNums.length;
        
        int x = 0, y = 0, k=0;
//         int max;
//         if (one >= two)
//             max = 2*two;
//         else
//             max = 2*one;
        
//                 System.out.println(one);
//                 System.out.println(two);
//                 System.out.println(max);

        
        for( int i=0; i <= mergelen; i++){
            if(x == one || y == two)
                break;
            if(nums1[x] <= nums2[y] ){
                System.out.println(nums1[x]);
                mergedNums[i]= nums1[x];
                k++;
                x++;
            } else {
                System.out.println(nums2[y]);
                mergedNums[i]= nums2[y];
                k++;
                y++;
            }            
        }
        
        
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
        
        
//         if(x == one - 1){
//            while(y != two){
//                mergedNums[i] = nums2[y]; 
//                y++;
//                i++;        
        
        
       for(int v : mergedNums)
           System.out.print(v);

        
        
        if(mergelen % 2 == 0){
            // System.out.println((mergedNums[mergelen/2-1] + ));
            return (mergedNums[mergelen/2-1] + mergedNums[mergelen/2])/2.0;
        }
        else
            return mergedNums[(mergelen-1)/2];
    }
}





// if(nums1[x] <= nums2[y] && x < one){
//     mergedNums[i]= nums1[x];
//     x++;
// } else {
//     mergedNums[i]= nums1[y];
//     y++;
// }


// 1  -----  0
// 2 ------  0 + 1
// 3 ------  1
// 4 ------  1 + 2


//nums1      m
//nums2      n











// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int one = nums1.length;
//         int two = nums2.length;
//         int[] mergedNums = new int[one + two];
        
//         int x = 0, y = 0, i =0;
        
//         for( int k = i; i < one + two; i++){
//             if( x < one && y < two && nums1[x] <= nums2[y] ){
//                 System.out.println(nums1[x]);
//                 mergedNums[i]= nums1[x];
//                 i++;
//                 x++;
//             } else if(x < one && y < two ){
//                 System.out.println(nums2[y]);
//                 mergedNums[i]= nums2[y];
//                 i++;
//                 y++;
//             }            
//         }
//                 System.out.println();
//                 System.out.println(x);
//                 System.out.println(y);

//         if(x == one - 1){
//            while(y != two){
//                mergedNums[i] = nums2[y]; 
//                y++;
//                i++;
//            } 
//         }
//         if(y == two - 1 ){
//            while(x != one){
//                mergedNums[i] = nums1[x]; 
//                x++;
//                i++;
//            } 
//         }

//        for(int v : mergedNums)
//            System.out.print(v);
        
//         int mergelen =  mergedNums.length;
//         if(mergelen % 2 == 0){
//             return (mergedNums[mergelen/2-1] + mergedNums[mergelen/2])/2;
//         }
//         else
//             return mergedNums[(mergelen-1)/2];
//     }
// }





// if(nums1[x] <= nums2[y] && x < one){
//     mergedNums[i]= nums1[x];
//     x++;
// } else {
//     mergedNums[i]= nums1[y];
//     y++;
// }


// 1  -----  0
// 2 ------  0 + 1
// 3 ------  1
// 4 ------  1 + 2


//nums1      m
//nums2      n
