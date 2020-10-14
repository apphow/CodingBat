public class ArrayCount9 {
// Given an array of ints, return the number
// of 9's in the array.
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 9};
        System.out.println("[1, 2, 9] should return 1: " + arrayCount9(nums));
        int nums1[] = {1, 9, 9};
        System.out.println("[1, 9, 9] should return 2: " + arrayCount9(nums1));
        int nums2[] = {1, 9, 9, 3, 9};
        System.out.println("[1, 9, 9, 3, 9] should return 3: " + arrayCount9(nums2));
        int nums3[] = {1, 2, 3};
        System.out.println("[1, 2, 3] should return 0: " + arrayCount9(nums3));
        int nums4[] = {};
        System.out.println("[] should return 0: " + arrayCount9(nums4));
        int nums5[] = {4, 2, 4, 3, 1};
        System.out.println("[4, 2, 4, 3, 1] should return 0: " + arrayCount9(nums5));
        int nums6[] = {9, 2, 4, 3, 1};
        System.out.println("[9, 2, 4, 3, 1] should return 1: " + arrayCount9(nums6));
        int nums7[] = {8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println("[8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9] should return 8: " + arrayCount9(nums7));
        int nums8[] = {99, 99, 99};
        System.out.println("[99, 99, 99] should return 0: " + arrayCount9(nums8));
    }
}
