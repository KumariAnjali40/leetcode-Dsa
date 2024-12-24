class Solution {
    public boolean isPalindrome(int x) {
        
        //The Time complexity is O(n);
        String res=String.valueOf(x);
    //     String ans="";
    //     for(int i=res.length()-1;i>=0;i--){
    //         ans=ans+res.charAt(i);
    //     }
    //     if(ans.equals(res)){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    //Time complexity is O(n/2);
    for(int i=0;i<res.length()/2;i++){
        if(res.charAt(i)!=res.charAt(res.length()-1-i)){
            return false;
        }
    }
    return true;
    }
}