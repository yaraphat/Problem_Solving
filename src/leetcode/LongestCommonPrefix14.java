package leetcode;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) return strs[0];

        int index, prefixlength, outerLimit, innerLimit;
        outerLimit = strs.length - 1;
        prefixlength = strs[0].length();

        for (index = 0; index < outerLimit; index++) {
            innerLimit = Math.min(prefixlength, strs[index + 1].length());
            for (prefixlength = 0; prefixlength < innerLimit; prefixlength++) {
                if (strs[index].charAt(prefixlength) != strs[index + 1].charAt(prefixlength)) {
                    break;
                }
            }
            if (prefixlength < 1) return "";
        }
        return prefixlength > 0 ? strs[index].substring(0, prefixlength) : "";
    }
}
