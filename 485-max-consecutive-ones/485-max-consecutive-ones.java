class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0;
        int temp = 0;
        for(int i =0; i < len; i++){
            if(nums[i] == 1)
                temp++;
            else {
                if(temp > max){
                    max = temp;
                    temp = 0;   
                }
                else {
                    temp =0;
                }
            }
        }
        if(temp > max) return temp;
        return max;
    }
}


// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//                // int[] a = new int[]{1,1,1,1,0,1,1,1};

//        int basket = 0;
//        int temp = 0;
//        for(int i= 0; i < nums.length ; i++){
//            if (nums[i] == 1){
//                temp = temp + 1 ;
//            }
//            else {
//                if (basket >= temp){
//                    temp = 0;
//                    continue;
//                }
//                else {
//                    basket = temp;
//                    temp = 0;
//                }
//            }
//         }
//        if (temp>=basket){
//            basket= temp;
//        }
//         return basket;
//     }
// }