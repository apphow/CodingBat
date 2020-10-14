public class ArrayFront9 {

    // Given an array of ints, return true if
    // one of the first 4 elements in the array
    // is a 9. The array length may be less than 4.

    public static boolean arrayFront9(int[] nums) {
        // First figure the end for the loop
        if(nums.length > 4) {
            int end = 4;
            for (int i = 0; i < end; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
            return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(nums));
    }
}
