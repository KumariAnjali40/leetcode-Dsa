class Solution {
    public int search(int[] nums, int target) {
      int n=nums.length;
        int pivot_index=findPivot(nums);
        
        int idx=binarySearch(nums, 0, pivot_index-1, target);

        if(idx!=-1){
            return idx;
        }

        idx=binarySearch(nums,pivot_index,n-1,target);

        return idx;

    }

   public static int binarySearch(int [] nums, int low,int high, int target){

          int ans=-1;

       while(low<=high){
           int mid=low+(high-low)/2;

           if(nums[mid]==target){
               ans=mid;
               high=mid-1;
           }else if(nums[mid]<target){
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
       return ans;
   }



    public static int findPivot(int [] nums){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}