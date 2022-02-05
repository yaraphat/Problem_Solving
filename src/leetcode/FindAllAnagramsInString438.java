
package leetcode;

import java.util.*;

public class FindAllAnagramsInString438 {

    public static List<Integer> findAnagramsUsingSlidingWindowAlgorithm(String s, String p) {
        List<Integer> indices = new LinkedList<>();
        if (s.length() < p.length()) return indices;
        Map<Character, Integer> baseCharacterCounts = new HashMap<>();
        Map<Character, Integer> matchingCharacterCounts = new HashMap<>();
        try {
            int count;
            // Populate the character count maps for the first set of characters in the string s
            // For each character in s we need to check following (p.length() - 2) characters
            // each set of characters from s should contain total p.length() characters
            for (int i = 0; i < p.length(); i++) {
                count = baseCharacterCounts.getOrDefault(p.charAt(i), 0) + 1;
                baseCharacterCounts.put(p.charAt(i), count);
            }
            for (int i = 0; i < p.length(); i++) {
                if (baseCharacterCounts.containsKey(s.charAt(i))) {
                    count = matchingCharacterCounts.getOrDefault(s.charAt(i), 0) + 1;
                    matchingCharacterCounts.put(s.charAt(i), count);
                }
            }

            if (baseCharacterCounts.equals(matchingCharacterCounts)) {
                indices.add(0);
            }

            Character previousChar, newChar;

            int searchLimit = s.length() - p.length();
            for (int i = 1; i <= searchLimit; i++) {
                previousChar = s.charAt(i - 1);
                newChar = s.charAt(i + p.length() - 1);

                if (baseCharacterCounts.containsKey(previousChar)) {
                    count = matchingCharacterCounts.getOrDefault(previousChar, 0) - 1;
                    matchingCharacterCounts.put(previousChar, count);
                }
                if (baseCharacterCounts.containsKey(newChar)) {
                    count = matchingCharacterCounts.getOrDefault(newChar, 0) + 1;
                    matchingCharacterCounts.put(newChar, count);
                }
                if (baseCharacterCounts.equals(matchingCharacterCounts)) {
                    indices.add(i);
                }
            }
        } catch (Exception ignored) {

        }

        return indices;
    }



}