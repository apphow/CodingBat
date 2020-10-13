public class CapitalizeLastThreeLetters {

    // Given a string, return a new string where the last 3 chars
    // are now in upper case. If the string has less than 3 chars,
    // uppercase whatever is there. Note that str.toUpperCase()
    // returns the uppercase version of a string.
    public static String endUp(String str) {
        if(str.length() < 3) {
            return str.toUpperCase();
        }
        String lastThree = str.substring(str.length()-3).toUpperCase();
        return str.substring(0, str.length() -3) + lastThree;
    }

    public static void main(String[] args) {
        System.out.println("('Hello') should return 'HeLLO': " + endUp("Hello"));
        System.out.println("('hi there') should return 'hi thERE': " + endUp("hi there"));
        System.out.println("('hi') should return 'HI': " + endUp("hi"));
        System.out.println("('woo hoo') should return 'woo HOO': " + endUp("woo hoo"));
        System.out.println("('xyz12') should return 'xyZ12': " + endUp("xyz12"));
        System.out.println("('x') should return 'X': " + endUp("x"));
        System.out.println("('') should return '': " + endUp(""));
    }
}
