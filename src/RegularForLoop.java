public class RegularForLoop {

    public static String regularForLoop(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(regularForLoop("Hello"));
    }
}
