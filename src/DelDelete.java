public class DelDelete {
    // Given a string, if the string "del" appears starting at index 1, return
    // a string where "del" has been deleted. Otherwise, return the string unchanged

    public static String delDel(String str) {
        if(str.length() <= 3) {
            return str;
        } if(str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("adelbc: should return 'abc': " + delDel("adelbc"));
        System.out.println("adelHello: should return 'aHello': " + delDel("adelHello"));
        System.out.println("adedbc: should return 'adedbc': " + delDel("adedbc"));
        System.out.println("abcdel: should return 'abcdel': " + delDel("abcdel"));
        System.out.println("add: should return 'add': " + delDel("add"));
        System.out.println("ad: should return 'ad': " + delDel("ad"));
        System.out.println("a: should return 'a': " + delDel("a"));
        System.out.println(": should return '': " + delDel(""));
        System.out.println("del: should return 'del': " + delDel("del"));
        System.out.println("adel: should return 'a': " + delDel("a"));
        System.out.println("aadelbb: should return 'aadelbb': " + delDel("aadelbb"));


    }
}
