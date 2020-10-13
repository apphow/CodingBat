import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DoubleX {

    // Given a string, return true if the first instance of "x" in the string
    // is immediately followed by another "x".
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");
    }

    public static void main(String[] args) {
        System.out.println("'axxbb' should return true; " +doubleX("axxbb"));

        System.out.println("'axaxax' should return false: " + doubleX("axaxax"));
        System.out.println("'xxxxx' should return true: " + doubleX("xxxxx"));
        System.out.println("aaaax' should return false: " + doubleX("xaxxx"));
        System.out.println("'aaaax' should return false: " + doubleX("aaaax"));
        System.out.println("'' should return false: " + doubleX(""));
        System.out.println("'abc' should return false: " + doubleX("abc"));
        System.out.println("'x' should return false: " + doubleX("x"));
        System.out.println("'xx' should return true: " + doubleX("xx"));
        System.out.println("'xax' should return false: " + doubleX("xax"));
        System.out.println("'xaxx' should return false: " + doubleX("xaxx"));

    }
}
