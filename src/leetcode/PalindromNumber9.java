package leetcode;

public class PalindromNumber9 {
    public boolean isPalindrome(int x) {
        String str = "" + x;
        int low = 0;
        int high = str.length() -1;

        while(low <= high){
            if(str.charAt(low++) != str.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
