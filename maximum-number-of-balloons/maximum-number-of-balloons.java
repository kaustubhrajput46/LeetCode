class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        char[] textchar = text.toCharArray();
        for(char c : textchar){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else map.put(c, 1);
        }
        char[] balloon = "balloon".toCharArray();
        int res =0;
        boolean val = true;
        while(val){
            for(int i =0; i< balloon.length; i++){
                if(map.containsKey(balloon[i])){
                    if(map.get(balloon[i]) == 0) val = false; 
                    map.put((balloon[i]), map.get(balloon[i])-1);
                } else val = false;
            }
            if(val == false) continue;
            res++;
        }
        return res;
    }
}