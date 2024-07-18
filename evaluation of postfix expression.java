class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        for(char ch:S.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int var1 = stack.pop(), var2 = stack.pop();
                if(ch=='+') stack.push(var2 + var1);
                else if(ch=='-') stack.push(var2 - var1);
                else if(ch=='*') stack.push(var2 * var1);
                else stack.push(var2 / var1);
            }
        }
        return stack.pop();
    }
}
