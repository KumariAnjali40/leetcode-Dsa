class Solution {
    public boolean isValid(String s) {
       Stack<Character>st = new Stack<>();
        int index=0;
        int n =s.length();
        boolean ans = solve(s,st,index,n);
        return ans;
        
    }

    public boolean solve(String s, Stack<Character>st, int ind, int n){
        if(ind>=n) return true;


        char ch=s.charAt(ind);

        if( !st.isEmpty()  && (st.peek()=='(' && ch==')' || st.peek()=='{' && ch=='}' || st.peek()=='[' && ch==']')){
            st.pop();
            solve(s,st,ind+1,n);
        }else{
            st.push(ch);
            solve(s,st,ind+1,n);
        }

        return st.isEmpty();
    }
        
 }