package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        int length = nums.length;

        for (int num : nums) {
            Integer count = counts.getOrDefault(num, 0);
            count++;
            counts.put(num, count);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }
}
