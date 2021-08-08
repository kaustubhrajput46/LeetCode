public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < Integer, List < String >> map = new HashMap < > ();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList < String > ());
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: map.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        String[] res = new String[map.get(min_index_sum).size()];
        return map.get(min_index_sum).toArray(res);
    }
}





// class Solution {
//     public String[] findRestaurant(String[] list1, String[] list2) {
//         Map<String, Integer> map1 = new HashMap<>();
//         Map<String, Integer> map2 = new HashMap<>();
//         int minIndexVal = 2000;
//         //Add elements of the list1 in map1
//         for(int i =0; i< list1.length; i++){
//             map1.put(list1[i], i);
//         }
//         //Add only common elements and sum the index of elements
//         for(int i =0; i< list2.length; i++){
//             //check if already present in the map1
            
//             if(map1.containsKey(list2[i])) {
//                 //update the min value of minIndexVal;
//                 int indexSum = i + map1.get(list2[i]);
//                 if(indexSum < minIndexVal) minIndexVal = indexSum;
//                 //add the contents
//                 map2.put(list2[i], indexSum);
//                 // System.out.println(list2[i]+" "+indexSum);
//             }
//         }
//         //clear map1
//         map1.clear();
//         //traverse map2
//         for(Map.Entry<String, Integer> entry : map2.entrySet()){
//             //add pairs having value same as minIndexVal
//             if(entry.getValue() == minIndexVal) map1.put(entry.getKey(), entry.getValue());
            
//         }
//         Set<String> resSet = map1.keySet();
//         //map 1 contains only the common elements
//         return resSet.toArray(new String[0]);
//     }
// }