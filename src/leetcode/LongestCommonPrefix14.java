package leetcode;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) return strs[0];

        int indexOfLongestPrefixWord, prefixlength, outerLimit, innerLimit;
        outerLimit = strs.length - 1;
        prefixlength = strs[0].length();

        for (indexOfLongestPrefixWord = 0; indexOfLongestPrefixWord < outerLimit; indexOfLongestPrefixWord++) {
            innerLimit = Math.min(prefixlength, strs[indexOfLongestPrefixWord + 1].length());
            for (prefixlength = 0; prefixlength < innerLimit; prefixlength++) {
                if (strs[indexOfLongestPrefixWord].charAt(prefixlength) != strs[indexOfLongestPrefixWord + 1].charAt(prefixlength)) {
                    break;
                }
            }
            if (prefixlength < 1) return "";
        }
        return prefixlength > 0 ? strs[indexOfLongestPrefixWord].substring(0, prefixlength) : "";
    }
}
