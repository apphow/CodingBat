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

    public static void main(String[] args) {
        System.out.println("startOz('ozymandias') should return 'oz': " + startOz("ozymandias"));
        System.out.println("startOz2('ozymandias') should return 'oz': " + startOz2("ozymandias"));
        System.out.println("\nstarOz('bzoo') should return 'z': " + startOz("bzoo"));
        System.out.println("startOz2('bzoo') should return 'z': " + startOz2("bzoo"));
        System.out.println("\nstarOz('oxx') should return 'o': " + startOz("oxx"));
        System.out.println("startOz2('oxx') should return 'o': " + startOz2("oxx"));
        System.out.println("\nstarOz('oz') should return 'oz': " + startOz("oz"));
        System.out.println("startOz2('oz') should return 'oz': " + startOz2("oz"));

        System.out.println("\nstarOz('ounce') should return 'o': " + startOz("ounce"));
        System.out.println("startOz2('ounce') should return 'o': " + startOz2("ounce"));

        System.out.println("\nstarOz('o') should return 'o': " + startOz("o"));
        System.out.println("startOz2('o') should return 'o': " + startOz2("o"));

        System.out.println("\nstarOz('abc') should return '': " + startOz("abc"));
        System.out.println("startOz2('abc') should return '': " + startOz2("abc"));

        System.out.println("\nstarOz('') should return '': " + startOz(""));
        System.out.println("startOz2('') should return '': " + startOz2(""));

        System.out.println("\nstarOz('zoo') should return '': " + startOz("zoo"));
        System.out.println("startOz2('zoo') should return '': " + startOz2("zoo"));

        System.out.println("\nstarOz('aztec') should return 'z': " + startOz("aztec"));
        System.out.println("startOz2('aztec') should return 'z': " + startOz2("aztec"));

        System.out.println("\nstarOz('zzzz') should return 'z': " + startOz("zzzz"));
        System.out.println("startOz2('zzzz') should return 'z': " + startOz2("zzzz"));

        System.out.println("\nstarOz('oznic') should return 'oz': " + startOz("oznic"));
        System.out.println("startOz2('oznic') should return 'oz': " + startOz2("oznic"));

    }
}
