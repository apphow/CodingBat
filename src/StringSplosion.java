public class StringSplosion {

    // Given a non-empty string like "Code" return a string like "CCoCodCode".
    public static String stringSplosion(String str) {
        String newStr = "";
        for(int i = 0; i< str.length(); i++) {
            // On each iteration, add the substring of the chars 0..i
            newStr = newStr + str.substring(0, i + 1);
        }
        return newStr;

    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
        System.out.println(stringSplosion("x"));
        System.out.println(stringSplosion("fade"));
        System.out.println(stringSplosion("There"));
        System.out.println(stringSplosion("Kitten"));
        System.out.println(stringSplosion("Bye"));
        System.out.println(stringSplosion("Good"));
        System.out.println(stringSplosion("Bad"));
    }
}
