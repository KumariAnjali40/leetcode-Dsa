class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
     
        for(int i=0;i<nums.length;i++){
            int target = -nums[i];
           if(i > 0 && nums[i] == nums[i-1]){
              continue;
           }else {
               towSum(nums,result,i,target);
           }
        }
        return result;
    }
    
    public static void towSum(int [] nums, List<List<Integer>> ans ,int index, int target){
        
        int left = index+1;
        int right = nums.length-1;
        
        while(left < right) {
         int sum = nums[left] + nums[right];
            
            if(sum == target){
             ans.add(Arrays.asList(nums[index],nums[left],nums[right]));
              while(left<right && nums[left] == nums[left+1]) left++;
               while(left<right && nums[right] == nums[right-1]) right--;
                left++;
                right--;
            }else if(sum < target){
              left++;
            }else {
             right--;
            }
        }
    }
}