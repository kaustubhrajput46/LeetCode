class Solution {
    public int minOperations(String s) {
        // let us generate two possible alternating strings .
        char[] ch = s.toCharArray();
        int len = ch.length;
        int[] alt1 = new int[len];
        int[] alt2 = new int[len];
        int alt1val = 0;
        int alt2val = 0;
        for(int i = 0; i< len; i++){
            alt1[i]= 48;
            alt2[i]= 48;
            if(i%2 == 0){
                alt1[i]= 49;
            }
            else{
                alt2[i]= 49;
            } 
            if(alt1[i] != (int)ch[i]) alt1val++;
            if(alt2[i] != (int)ch[i]) alt2val++;
        }
        if (alt1val > alt2val) return alt2val;
        else return alt1val;
    }
}