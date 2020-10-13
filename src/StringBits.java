public class StringBits {

    public static String stringBits(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i= i+2){
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("'Hello' should return 'Hlo': " + stringBits("Hello"));
    }
}
