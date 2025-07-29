class MinStack {
     int minValue=Integer.MAX_VALUE;
        Stack<Integer> st;
    public MinStack() {
       
        st=new Stack<Integer>();
    }
    
    public void push(int val) {
        
        if(val<=minValue)
        {
            st.push(minValue);
            minValue=val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop()==minValue)
            minValue=st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minValue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */