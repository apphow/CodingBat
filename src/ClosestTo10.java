public class ClosestTo10 {
    // Given 2 int values, return whichever value is nearest to the
    // value 10, or return 0 in the event of a tie.

    public static int closestTo10(int a, int b) {
        if(Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } if(Math.abs(10 - b) < Math.abs(10 - a)) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("(8, 13) should return 8: " + closestTo10(8, 13));
        System.out.println("(13, 8) should return 8: " + closestTo10(13, 8));
        System.out.println("(13, 7) should return 0: " + closestTo10(13, 7));
        System.out.println("(7, 13) should return 0: " + closestTo10(7, 13));
        System.out.println("(9, 13) should return 9: " + closestTo10(9, 13));
        System.out.println("(13, 8) should return 8: " + closestTo10(13, 8));
        System.out.println("(10, 12) should return 10: " + closestTo10(10, 12));
        System.out.println("(11, 10) should return 10: " + closestTo10(11, 10));
        System.out.println("(5, 21) should return 5: " + closestTo10(5, 21));
        System.out.println("(0, 20) should return 0: " + closestTo10(0, 20));
        System.out.println("(10, 10) should return 0: " + closestTo10(10, 10));
        System.out.println("(100, -50) should return -50: " + closestTo10(100, -50));


    }
}
