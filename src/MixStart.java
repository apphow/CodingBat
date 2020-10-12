public class MixStart {
    // Return true if the given string begins with "mix",
    // except the 'm' can be anything, so "pix", "9ix" .. all count.
    public static boolean mixStart(String str) {
        if (str.length() >= 3) {
            if (str.substring(1, 3).equals("ix")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("'mix snacks' should return true: " + mixStart("mix snacks"));
        System.out.println("'pix snacks' should return true: " + mixStart("pix snacks"));
        System.out.println("'piz snacks' should return false: " + mixStart("piz snacks"));
        System.out.println("'nix' should return true: " + mixStart("nix"));
        System.out.println("'ni' should return false: " + mixStart("ni"));
        System.out.println("'n' should return false: " + mixStart("n"));
        System.out.println("'' should return false: " + mixStart(""));


    }
}
