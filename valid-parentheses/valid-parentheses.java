class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] ss = s.toCharArray();
        for(int i = 0; i< ss.length; i++){
            if(stack.isEmpty()) {
                stack.push(ss[i]);
                if (!(ss[i] == '{' || ss[i] == '[' || ss[i] == '(')) return false;
            }
            else if (ss[i] == '{' || ss[i] == '[' || ss[i] == '(') stack.push(ss[i]);
            else if((ss[i] == '}' && stack.peek() == '{') || (ss[i] == ']' && stack.peek() == '[') || (ss[i] == ')' && stack.peek() == '(')) {
                stack.pop();   
            } else
                stack.push(ss[i]);
        }
        return stack.isEmpty();
    }
}