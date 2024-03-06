//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        //  int n = Integer.parseInt(str);
        
        
        // int num = n;
        // int ans = 0;
 
        // int base = 1;
 
        // int temp = num;
        // while (temp > 0) {
        //     int last_digit = temp % 10;
        //     temp = temp / 10;
 
        //     ans += last_digit * base;
 
        //     base = base * 2;
        // }
 
        // return ans;
        
        int ans = 0 ;
        int base = 1;
        
        String s = str;
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=base;
                
            }
              base =base*2;
        }
        
        return ans;
        
    }
    
}