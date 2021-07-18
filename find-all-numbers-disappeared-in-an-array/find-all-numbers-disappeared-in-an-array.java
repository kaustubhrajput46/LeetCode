class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        //new array of same length to maintain occurance of the numbers in nums
        int[] track = new int[n+1];
        //keep track of no of unique elements present
        int len = 0;

        for(int i=0; i<n ; i++){
            track[nums[i]]++;
            // if(track[nums[i]] == 0){
            //     track[nums[i]]++;
            //     len++;
            }
        

        List<Integer> list=new ArrayList<Integer>();  
        for(int i=1; i<=n ; i++){
            if(track[i] == 0)
                list.add(i);
        }
        
        return list;
    }
}

// get the new array with all values as 0
// increment the values of indexe