package leetcode;


class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int valCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = 0;
                valCount += 1;
            } else {
                nums[i - valCount] = nums[i];
            }
        }
        return nums.length - valCount;
    }
}