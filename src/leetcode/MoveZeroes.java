package leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int insertionIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != insertionIndex){
                    nums[insertionIndex] = nums[i];
                    nums[i] = 0;
                }
                insertionIndex++;
            }
        }
    }
}
