class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
            for(int i = 0; i< n/2; i++){
                arr[i] = n- i;
                arr[n-i-1] = -(n-i);
            }
        for(int i : arr) System.out.println(i);
        return arr;
    }
}