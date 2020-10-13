public class BiggerNumberInRange1020 {

    // Give 2 positive int values, return the larger value that is in
    // the range 10..20 inclusive, or return 0 if neither is in that range.
    public static int biggerNumberInRange1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return Math.max(a, b);
        } else if ((a >= 10 && a <= 20) && (b < 10 || b > 20)) {
            return a;
        }
        if ((b >= 10 && b <= 20) && (a < 10 || a > 20)) {
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("(11, 19) should return 19: " + biggerNumberInRange1020(11, 19));
        System.out.println("(19, 11) should return 19: " + biggerNumberInRange1020(19, 11));
        System.out.println("(11, 9) should return 11: " + biggerNumberInRange1020(11, 9));
        System.out.println("(9, 21) should return 0: " + biggerNumberInRange1020(9, 21));
        System.out.println("(10, 21) should return 10: " + biggerNumberInRange1020(10, 21));
        System.out.println("(21, 10) should return 10: " + biggerNumberInRange1020(21, 10));
        System.out.println("(9, 11) should return 11: " + biggerNumberInRange1020(9, 11));
        System.out.println("(23, 10) should return 10: " + biggerNumberInRange1020(23, 10));
        System.out.println("(20, 10) should return 20: " + biggerNumberInRange1020(20, 10));
        System.out.println("(7, 20) should return 20: " + biggerNumberInRange1020(7, 20));
        System.out.println("(17, 16) should return 17: " + biggerNumberInRange1020(17, 16));
        System.out.println("(111, 112) should return 0: " + biggerNumberInRange1020(111, 112));

    }
}