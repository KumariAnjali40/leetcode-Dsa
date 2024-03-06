class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list = new ArrayList<>();

         par(list,0,0,n,"");

         return list;


    }

    public static void par(List<String>list ,int open, int close, int n,String s){
       if(s.length()==2*n){
           list.add(s);

           return ;
       }
        if(open<n){
           par(list,open+1,close,n,s+'(');
        }

        if(close<open){
            par(list,open,close+1,n,s+')');
        }
    }
}