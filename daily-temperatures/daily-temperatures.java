class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[len];
        
        stack.push(0);
        for(int i = 1; i < len; i++){
            if(stack.isEmpty() || (temperatures[stack.peek()] > temperatures[i])){
                stack.push(i);
            } else {
                while(!stack.isEmpty() && (temperatures[stack.peek()] < temperatures[i])){
                    int val = stack.pop();
                    // System.out.println(i-val);
                    res[val] = i - val;
                }
                stack.push(i);
            }
        }
        
        
        
        return res;
    }
}