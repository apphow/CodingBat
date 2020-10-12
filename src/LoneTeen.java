public class LoneTeen {
    // we'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // return true if one or the other is teen, but not both;

    public static boolean loneTeen(int a, int b) {
        boolean isTeen = a >= 13 && a <= 19;
        boolean isTeen2 = b >= 13 && b <= 19;
        if((isTeen && !isTeen2) || (isTeen2 && !isTeen)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("a: " + 13 + ", b: " + 99 + " should return true;");
        System.out.println(" " + loneTeen(13, 99));

        System.out.print("a: " + 21 + ", b: " + 19 + " should return true;");
        System.out.println(" " + loneTeen(21, 19));

        System.out.print("a: " + 13 + ", b: " + 13 + " should return false;");
        System.out.println(" " + loneTeen(13,13));

        System.out.print("a: " + 14 + ", b: " + 20 + " should return true;");
        System.out.println(" " + loneTeen(14, 20));

        System.out.print("a: " + 20 + ", b: " + 15 + " should return true;");
        System.out.println(" " + loneTeen(20, 15));

        System.out.print("a: " + 16 + ", b: " + 17 + " should return false;");
        System.out.println(" " + loneTeen(16, 17));

        System.out.print("a: " + 16 + ", b: " + 9 + " should return true;");
        System.out.println(" " + loneTeen(16, 9));

        System.out.print("a: " + 16 + ", b: " + 18 + " should return false;");
        System.out.println(" " + loneTeen(16, 18));

        System.out.print("a: " + 13 + ", b: " + 19 + " should return false;");
        System.out.println(" " + loneTeen(13, 19));

        System.out.print("a: " + 13 + ", b: " + 20 + " should return true;");
        System.out.println(" " + loneTeen(13, 20));

        System.out.print("a: " + 6 + ", b: " + 18 + " should return true;");
        System.out.println(" " + loneTeen(6, 18));

        System.out.print("a: " + 99 + ", b: " + 13 + " should return true;");
        System.out.println(" " + loneTeen(99, 13));

        System.out.print("a: " + 99 + ", b: " + 99 + " should return false;");
        System.out.println(" " + loneTeen(99, 99));
    }
}
