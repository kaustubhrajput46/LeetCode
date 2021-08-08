class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}
// class Solution {
//     public int firstUniqChar(String s) {
//         if (s.length() == 1) return 0;
//         char[] ss = s.toCharArray();
        
//         //HashMap to store occurances
//         Map<Character, Integer> map = new HashMap<>();
        
//         for(int i = 0; i< ss.length; i++){
//             // Character c = s.charAt(i);
//             if(map.containsKey(ss[i])) map.put(ss[i], map.get(ss[i])+1);
//             else map.put(ss[i], 1);
//         }
//         for(int i = 0; i< ss.length; i++){
//             // Character c = ss[i];
//             if(map.get(ss[i]) == 1) return i; 
//         }
//         return -1;
//     }
// }


// class Solution {
//     public int firstUniqChar(String s) {
//         if (s.length() == 1) return 0;
//         //HashMap to store occurances
//         Map<Character, Integer> map = new HashMap<>();
        
//         for(int i = 0; i< s.length(); i++){
//             Character c = s.charAt(i);
//             if(map.containsKey(c)) map.put(c, map.get(c)+1);
//             else map.put(c, 1);
//         }
//         for(int i = 0; i< s.length(); i++){
//             Character c = s.charAt(i);
//             if(map.get(c) == 1) return i; 
//         }
//         return -1;
//     }
// }