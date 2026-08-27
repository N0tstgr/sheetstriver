class Solution {
    public int majorityElement(int[] nums) {
        int a = (nums.length)/2;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] ==nums[j]){
                    count++;
                    // return new int[]{count++};
                }
            }
             if(count>a){
                return nums[i];
             }
        }
      return nums[0];
    }
}
