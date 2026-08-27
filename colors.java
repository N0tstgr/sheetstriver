class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    swap(nums, nums[j], nums[j-1]);
                }
            } 
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
