class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        //construct hashmap for s
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        //tranverse t
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i), map.get(t.charAt(i))-1);
                }
            } else 
                return false;
        }
        if(map.size() != 0 ) return false;
        return true;
    }
}