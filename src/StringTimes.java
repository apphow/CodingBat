public class StringTimes {

    // Given a string and a non-negative int n, return a
    // larger string that is n copies of the original string.

    public static String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("('Hi', 2) should return 'HiHi': " + stringTimes("Hi", 2));
        System.out.println("('Hi', 3) should return 'HiHiHi': " + stringTimes("Hi", 3));
        System.out.println("('Hi', 1) should return 'Hi': " + stringTimes("Hi", 1));
        System.out.println("('Hi', 0) should return '': " + stringTimes("Hi", 0));
        System.out.println("('Hi', 5) should return 'HiHiHiHiHi': " + stringTimes("Hi", 5));
        System.out.println("('Oh Boy!', 2) should return 'Oh Boy!Oh Boy!': " + stringTimes("Oh Boy!", 2));
        System.out.println("('x', 4) should return 'xxxx': " + stringTimes("x", 4));
        System.out.println("('', 4) should return '': " + stringTimes("", 4));
        System.out.println("('code', 2) should return 'codecode': " + stringTimes("code", 2));
        System.out.println("('code', 3) should return 'codecodecode': " + stringTimes("code", 3));
    }
}
