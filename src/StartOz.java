public class StartOz {
    // Given a string, return a string made of the first 2 chars
    // (if present), however include first char only if it is 'o'
    // and include the second only if it is 'z', so "ozymandias"
    // yields "oz".

    public static String startOz(String str) {
        String results = "";
        if(str.length() >= 1 && str.substring(0, 1).equals("o")) {
            results = str.substring(0, 1);
        } if(str.length() >= 2 && str.substring(1, 2).equals("z")) {
            results = results + str.substring(1, 2);
        }
        return results;
    }
    public static String startOz2(String str) {
        String result = "";
        if(str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if(str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }
}
