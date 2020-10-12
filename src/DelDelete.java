public class DelDelete {
    // Given a string, if the string "del" appears starting at index 1, return
    // a string where "del" has been deleted. Otherwise, return the string unchanged

    public static String deldel(String str) {
        if(str.length() <= 3) {
            return str;
        } if(str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("adelbc: should return 'abc': " + deldel("adelbc"));
    }
}
