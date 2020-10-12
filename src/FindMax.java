public class FindMax {

    // Given three int values, a b c, return the largest.
    public static int intMax(int a, int b, int c) {
        int x = Math.max(a, b);
        int y = Math.max(a, c);

        return Math.max(x, y);
    }
}

