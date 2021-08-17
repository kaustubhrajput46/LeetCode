class Solution {
    public int minCost(String s, int[] cost) {
        List<Integer> repeatingLeastCost = new ArrayList<>();
        int minCost = 0;
        //Need to find repeating characters 
        char[] chars = s.toCharArray();
        for(int i = 0; i< chars.length - 1; i++){
            if(chars[i] == chars[i+1]){
                int j = i+1;
                int max = i;
                while(chars[i] == chars[j] && j <chars.length ){
                    System.out.println(i+" "+j);
                    if(cost[j] > cost[max]) max = j;
                    j++;
                    if(j == chars.length) break;
                }

                for(int k = i; k < j; k++) {
                    if (k == max) continue;
                    repeatingLeastCost.add(k);
                }
                i = j-1;
                System.out.println("i: "+i);

            }
        }
        for(int a : repeatingLeastCost) minCost += cost[a];         
        return minCost;
    }
}
                
                
                
                
                
                
                
                
                
        //         int j = i+1;
        //         System.out.println(i+" "+j);
        //         if(cost[i] < cost[i+1]){
        //             System.out.println(i);
        //             repeatingLeastCost.add(i);
        //         } else {
        //             System.out.println(i+1);
        //             repeatingLeastCost.add(i+1);
        //         }
        //         // cost[i] < cost[i+1] ? repeatingLeastCost.add(i) : repeatingLeastCost.add(i+1);
        //         // repeatingLeastCost(Math.min())
        //     }
        // }
        
//         for(int i : repeatingLeastCost) minCost += cost[i]; 
        
//         return minCost;
//     }
// }


//Need to find repeating characters 
