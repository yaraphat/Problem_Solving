package leetcode;

public class ProductOfArrayExceptSelf238 {
    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int prod = 1;

        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            prod *= nums[i + 1];
            res[i] = res[i] * prod;
        }

        return res;
    }

    public static void test() {
        int[] arr = new int[]{-1, 1, 0, -3, 3};
        arr = productExceptSelf(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
