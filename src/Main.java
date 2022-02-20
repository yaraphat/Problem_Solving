import leetcode.LongestCommonPrefix14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long time = new Date().getTime();
        checkSolution();
        System.out.println("Total time elapsed = " + (new Date().getTime() - time) + " ms");
    }

    // Write test codes here
    private static void checkSolution() {
//        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        List<Integer> list = new ArrayList() {{
//            add(3);
//            add(0);
//            add(4);
//            add(2);
//            add(3);
//        }};
//
//        SortedSet<Integer> set = new TreeSet<>(list);
//        int index;
//        for (index = 0; index < nums.length; index++) {
//            if (!set.contains(nums[index])) {
//                break;
//            }
//        }
//        System.out.println(nums[index]);

        String outp = LongestCommonPrefix14.longestCommonPrefix(new String[]{"acc", "aaa", "aaba"});
        System.out.println(outp.equals("fl"));


    }


}



