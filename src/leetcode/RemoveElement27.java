package leetcode;


class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int currentPos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[currentPos] = nums[i];
                currentPos += 1;
            }
        }
        return currentPos;
    }
}