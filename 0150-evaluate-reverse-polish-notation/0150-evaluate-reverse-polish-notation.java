class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();

        for(String token : tokens)
        {
            if(isOperator(token))
            {
                int b=st.pop();
                int a=st.pop();
                int result=applyOpe(token, a, b);
                st.push(result);
            }
            else
                st.push(Integer.parseInt(token));
        }
        return st.pop();
    }
    private boolean isOperator(String token)
    {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    private int applyOpe(String operator, int a, int b)
    {
        switch(operator)
        {
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}