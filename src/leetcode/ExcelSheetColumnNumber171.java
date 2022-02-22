package leetcode;

public class ExcelSheetColumnNumber171 {
    public static int titleToNumber(String columnTitle) {
        int num = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            num += ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - i - 1));
        }
        return num;
    }
}
