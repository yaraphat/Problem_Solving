package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;
        Map<Character, Integer> romanToDecimalMap = new HashMap<>();
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int decimalNumber = romanToDecimalMap.get(s.charAt(0));
        int currentDigit, previousDigit;
        for (int i = 1; i < s.length(); i++) {
            currentDigit = romanToDecimalMap.get(s.charAt(i));
            previousDigit = romanToDecimalMap.get(s.charAt(i - 1));
            if (currentDigit <= previousDigit) {
                decimalNumber += currentDigit;
            } else {
                decimalNumber += currentDigit;
                decimalNumber += (-2 * previousDigit);
            }
        }

        return decimalNumber;
    }
}
