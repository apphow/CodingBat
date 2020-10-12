public class InTheRange {

    // Give 2 int values, return true if they are both in the range 30..40
    // inclusive, or they are both in the range 40..50 inclusive

    public static boolean inRange(int a, int b) {
        if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        } if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("(30, 31) should return true: " + inRange(30, 31));
        System.out.println("(30, 41) should return false: " + inRange(30, 41));
        System.out.println("(40, 50) should return true: " + inRange(40, 50));
        System.out.println("(40, 51) should return false: " + inRange(40, 51));
        System.out.println("(39, 50) should return false: " + inRange(39, 50));
        System.out.println("(50, 39) should return false: " + inRange(50, 39));
        System.out.println("(40, 39) should return true: " + inRange(40, 39));
        System.out.println("(49, 48) should return true: " + inRange(49, 48));
        System.out.println("(50, 40) should return true: " + inRange(50, 40));
        System.out.println("(50, 51) should return false: " + inRange(50, 51));
        System.out.println("(35, 36) should return true: " + inRange(35, 36));
        System.out.println("(35, 45) should return false: " + inRange(35, 45));

    }
}
