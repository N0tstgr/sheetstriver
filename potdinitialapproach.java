class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2 = new int[nums1.length];
         for(int  i = 0; i<nums1.length; i++){
            nums2[i] = nums1[i]; 
        }

        for(int  i = 0; i<nums1.length; i++){
            if(nums2[i] == nums1[i]){
                return true;
            }else if (nums2[i]==nums1[i] && nums1[i]%2!=0){
                return false;
            }
        }

        return false;
    }
}
