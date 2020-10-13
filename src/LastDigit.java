public class LastDigit {
    // Give two non-negative int values, return true if they have
    // the same last digit, such as with 27 and 57.

    public static boolean lastDigit(int a, int b) {
        if(a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("(7, 17) should return true: " + lastDigit(7, 17));
        System.out.println("(6, 17) should return false: " + lastDigit(6, 17));
        System.out.println("(3, 113) should return true: " + lastDigit(3, 113));
        System.out.println("(114, 113) should return false: " + lastDigit(114, 113));
        System.out.println("(114, 4) should return true: " + lastDigit(114, 4));
        System.out.println("(10, 0) should return true: " + lastDigit(10, 0));
        System.out.println("(11, 0) should return false: " + lastDigit(11, 0));
    }
}
