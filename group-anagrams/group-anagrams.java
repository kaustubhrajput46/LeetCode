class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
        List<List<String>> res = new ArrayList<List<String>>();
            res.add(new ArrayList<>(Arrays.asList(strs)));
            return res;
        } 
        List<List<String>> res = new ArrayList<List<String>>();

        //Store sorted anagram as key and all relevant anagrams as values
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i< strs.length; i++){
            //sort the string 
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            //check if sorted string is present as key in hashmap
            //if yes, append the original string in value
            //if no, add (sortedString, [originalString]) as key val pair in hashmap
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(strs[i])));
            }            
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}


//Steps
// create hashmap ()
//1. Sort the string
// check sorted string with the map keys and see if present