class Solution {
    public int trap(int[] height) {
         int n = height.length;
        
        int left = 0;
        int right = n-1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        
        while(left < right){
          
           if(height[left]< height[right]){
                if(height[left]<leftMax){
                    ans+=leftMax-height[left];
                }else {
                 leftMax = height[left];
                }
               left++;
           }else {
               if(height[right] < rightMax){
                   ans+= rightMax-height[right];
               }else {
                 rightMax = height[right];
                   
               }
               right--;
               
           }
        }
        return ans;
    }
}