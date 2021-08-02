class Solution {
    public boolean isHappy(int n) {
        //if n = 1, it is a happy number
        if (n==1) return true;
        Set<Integer> hashSet = new HashSet<>();
        
        //keep repeating the process until 1 is found
        while (n!= 1){
            int i = n;
            n = 0;
            while (i != 0 ){
                n = n + (i%10) * (i%10);
                i = i/10;
            }
            if (hashSet.contains(n)) return false;
            else hashSet.add(n);
            // n = sum;
        }
        //1 was found, number is happy
        return true;
    }
}