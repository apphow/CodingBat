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
}
