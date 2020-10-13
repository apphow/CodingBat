public class EveryNth {
    // Given a non-empty string and an int N, return the
    // string made starting with char 0, and then every Nth
    // char of the string. So if N is 3, use char 0, 3, 6, ...
    // and so on. N is 1 or more.

    public static String everyNth(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i= i + n) {
            newStr = newStr + str.charAt(i);

        }
        return newStr;

    }

    public static void main(String[] args) {
        System.out.println("('Friends') should return 'Fins': " + everyNth("Friends", 2));
        System.out.println("('Miracle', 2) should return 'Mrce': " + everyNth("Miracle", 2));
        System.out.println("('abcdefg', 2) should return 'aceg': " + everyNth("abcdefg", 2));
        System.out.println("('abcdefg', 3) should return adg': " + everyNth("abcdefg", 3));
        System.out.println("('Chocolate', 3) should return 'Cca': " + everyNth("Chocolate", 3));
        System.out.println("('Chocolates', 3) should return 'Ccas': " + everyNth("Chocolates", 3));
        System.out.println("('Chocolates', 4) should return 'Coe': " + everyNth("Chocolates", 4));
        System.out.println("('Chocolates', 100) should return 'C': " + everyNth("Chocolates", 100));
    }
}
