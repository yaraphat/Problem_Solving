package leetcode;

import java.util.*;

public class RemoveDuplicateFromArrayII80 {
    public static void main(String[] args) {

        int[] nums = new int[] { 0,0,1, 1, 1, 2, 2, 3 };
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int insPos = 0;
        int count = 0;
        int lastElement = 0;
        for (int i = 0; i < nums.length; i++) {
            count = lastElement == nums[i] ? count + 1 : 1;
            lastElement = nums[i];
            if (count < 3) {
                System.out.println(lastElement + "=" + count + "," + insPos);
                nums[insPos] = lastElement;
                insPos++;
            }
        }
        return insPos;
    }
}
