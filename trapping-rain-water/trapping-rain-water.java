class Solution {
    public int trap(int[] height) {
        int trapWater = 0;
        int traverse = 0;
        //traverse all the elevations
        while (traverse <= height.length){
            int temp = -1;
            //find the elevation of same or higher height
            for(int i = traverse+1; i < height.length; i++){
                if(height[i] >= height[traverse] ){
                    temp = i;
                    // System.out.println("temp : "+temp);
                    break;
                }
            }
            if (temp != -1){
                for(int i = traverse; i < temp; i++){
                    // System.out.println("2");
                    trapWater = trapWater + (height[traverse] - height[i]); 
                }
                //calcuated the value till the evelation of size equal or higher in height.
                traverse = temp;
                continue;
            }
            //No elevation of same or higher height found
            //Reduce the elevation by 1 and see if expected elevation is found
            if (traverse < height.length && height[traverse] >=1){
            height[traverse] = height[traverse] -1;
            // System.out.println("Traverse: "+traverse);
                
            } else {
                traverse++;
                
            }
        }
    
        return trapWater;
    }
}





//Calculate and disregard