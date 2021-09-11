class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //create a map to store words and their frequency
        Map<String, Integer> words = new HashMap<>();
        //traverse banned string and add it in hashset
        Set<String> bannedSet = new HashSet<>();
        for(int i = 0; i < banned.length; i++){
            bannedSet.add(banned[i]);
        }
        //track the most frequent throughout;
        String mostFreqWord = null;
        int freq = 0;
        //traverse the given string one by one
        for(int i = 0; i < paragraph.length(); i++){
            if(paragraph.charAt(i) == ' ') continue;
            int till = i;
            //traverse string one by one until a whitespace is reached

            while(till < paragraph.length() && paragraph.charAt(till) != ' ' &&
                paragraph.charAt(till) != '!' &&
                paragraph.charAt(till) != '?' &&
                paragraph.charAt(till) != '\'' &&
                paragraph.charAt(till) != ',' &&
                paragraph.charAt(till) != ';' &&
                paragraph.charAt(till) != '.'){
                till++;
            }
            //ignore the banned word
            if(bannedSet.contains(paragraph.substring(i, till).toLowerCase())) {
                i = till;
                continue;
            }
            //set the mostFreqWord
            if (mostFreqWord == null)
                mostFreqWord = paragraph.substring(i, till).toLowerCase();
            
            //if word already present in the map, increase its frequency
            if(words.containsKey(paragraph.substring(i, till).toLowerCase())){
                int localfreq = words.get(paragraph.substring(i, till).toLowerCase())+1;
                System.out.println(localfreq+" "+freq);
                if(localfreq > freq) {
                    mostFreqWord = paragraph.substring(i, till).toLowerCase();
                    freq = localfreq;
                    
                }
                words.put(paragraph.substring(i, till).toLowerCase(), localfreq);
            }
            else
                words.put(paragraph.substring(i, till).toLowerCase(), 1);
            i = till;
        }

        for(Map.Entry<String, Integer> entry : words.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        return mostFreqWord;
    }
}

//hashmap <String, int> -- stores word and its freq
