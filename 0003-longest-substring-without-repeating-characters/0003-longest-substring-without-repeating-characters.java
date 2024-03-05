class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){

          if(map.containsKey(s.charAt(j))){
             map.put(s.charAt(j),map.get(s.charAt(j))+1);
          
          }else{
             map.put(s.charAt(j),1);
          }
            
         if(map.size()> j-i+1){
            j++;
         }else if(map.size()==j-i+1){
            max=Math.max(max,j-i+1);
             j++;
         }else{
             while(map.size()<j-i+1){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                  if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                  }
                   i++;
             }
             j++;
         }
        
        }
         return max;
    }
}
