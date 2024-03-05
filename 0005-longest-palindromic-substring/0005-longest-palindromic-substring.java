class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();

     int max=Integer.MIN_VALUE;
     int start=0;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               if(isPal(s,i,j)){
                   if(max<j-i+1){
                       max=j-i+1;
                        start=i;
                   }
               }
           }
       }
       return s.substring(start,start+max);
    }
    public static boolean isPal(String s, int start, int end){
        if(start>=end){
            return true;
        }
         
        if(s.charAt(start)==s.charAt(end)){
           return isPal(s,start+1,end-1);
        }
        
        return false;
    }
}
