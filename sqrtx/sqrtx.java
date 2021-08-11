class Solution {
    public int mySqrt(int x) {
        if (x < 1 ) return 0;
        if (x < 4 ) return 1;
        int start = 1;
        int end = x -1;
        int pivot = 1;
        while(start<=end){
            pivot = start +  (end - start)/2;
            if(pivot == x/pivot || (pivot < x/pivot && (pivot+1) > x/(pivot+1) ) ) return pivot;
            if (pivot > x/pivot){
                
                end = pivot - 1;
            } else {
                start = pivot +1;
            }
        }
        //code should not reach here.
        return -1;
    }
}