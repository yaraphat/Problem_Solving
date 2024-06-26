package leetcode;

public class MajorityElement169 {

    public static int majorityElement(int[] nums) {
        int count = 1, majority = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }
        return majority;
    }
}
