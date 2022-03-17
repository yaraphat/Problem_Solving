package leetcode;

public class ScoreOfParentheses856 {
    public static int scoreOfParentheses(String s) {
        int score = 0;
        int carry = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (s.charAt(i + 1) == ')') {
                    score += carry;
                }
                carry *= 2;
            }else{
                carry /= 2;
            }
        }

        return score;

    }

    public static void test(String s) {
        if (s != null) {
            System.out.println(scoreOfParentheses(s));
        } else {
            System.out.println(scoreOfParentheses("((())(()))"));
        }
    }


}
