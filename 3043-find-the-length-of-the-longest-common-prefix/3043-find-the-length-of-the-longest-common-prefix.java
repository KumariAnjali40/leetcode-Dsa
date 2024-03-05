class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

         for(int a : arr1){
             String s = a+"";

             for(int i=0;i<s.length();i++){
                 int curr = Integer.parseInt(s.substring(0,i+1));
                 set.add(curr);
             }
         }

         int ans =0;
         for(int a : arr2){
             String s=a+"";
             for(int i=ans;i<s.length();i++){
                 int curr= Integer.parseInt(s.substring(0,i+1));
                 if(set.contains(curr)){
                     ans=i+1;
                 }
             }
         }

         return ans;
    }
}