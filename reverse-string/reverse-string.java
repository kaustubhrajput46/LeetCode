class Solution {
    public void reverseString(char[] s) {
        
        helper(0, s.length - 1, s);
        
    }

    public static void helper(int start, int end, char[] s){
        if(start > end || start == end)
            return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(start+1, end-1, s);
        // below could be used if it would be array of integers.
        // start = start - end;
        // end = start + end;
        // end = end - start;
    }
}





    