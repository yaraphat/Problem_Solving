package leetcode;

public class JumpGame150 {

    public static void main(String[] args) {
        System.out.println("true > " + canJump(new int[]{ 0 }));
        System.out.println("false > " + canJump(new int[]{ 0, 1 }));
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i <= maxReach && i < nums.length; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
