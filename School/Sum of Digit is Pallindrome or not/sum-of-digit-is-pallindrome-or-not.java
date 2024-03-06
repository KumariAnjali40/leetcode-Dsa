//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int ans =sum(n);
    
        
        if(isPal(ans)){
            return 1;
        }
        
        return 0;
        
    }
    
    public static int sum(int n){
        int num = n;
        int ans=0;
        while(num>0){
            int last_digit=num%10;
            ans+=last_digit;
            
            num=num/10;
        }
        
        return ans;
    }
    
    public static boolean isPal(int n){
        String s= String.valueOf(n);
        
        int low=0;
        int high =s.length()-1;
        
        while(low<=high){
        
        if(s.charAt(low)!=s.charAt(high)){
            return false;
        } else{
            low++;
            high--;
        }
        
        }
        return true;
        
    }
}