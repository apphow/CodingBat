public class Array123 {
    // Given an array of ints, return true if the
    // sequence of numbers 1, 2, 3 appears in the
    // array somewhere.
    public static boolean array123(int[] nums) {
        for(int i = 0; i < nums.length -1; i++) {
            if((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 1};
        System.out.println(array123(nums));

        int[] nums2 = {1, 1, 2, 1, 2, 1,};
        System.out.println(array123(nums2));
    }
}
