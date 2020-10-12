public class FindMax {

    // Given three int values, a b c, return the largest.
    public static int intMax(int a, int b, int c) {
        int x = Math.max(a, b);
        int y = Math.max(a, c);

        return Math.max(x, y);
    }

    public static void main(String[] args) {
        System.out.println("1, 2, 3 should return 3: " + intMax(1, 2, 3));
        System.out.println("1, 3, 2 should return 3: " + intMax(1, 3, 2));
        System.out.println("3, 2, 1 should return 3: " + intMax(3, 2, 1));
        System.out.println("9, 3, 3 should return 9: " + intMax(9, 3, 3));
        System.out.println("3, 9, 3 should return 9: " + intMax(3, 9, 3));
        System.out.println("3, 3, 9 should return 9: " + intMax(3, 3, 9));
        System.out.println("8, 2, 3 should return 8: " + intMax(8, 2, 3));
        System.out.println("-3, -1, -2 should return -1: " + intMax(-3, -1, -2));
        System.out.println("6, 2, 5 should return 6: " + intMax(6, 2, 5));
        System.out.println("5, 6, 2 should return 6: " + intMax(5, 6, 2));
        System.out.println("5, 2, 6 should return 6: " + intMax(5, 2, 6));

    }
}

