public class LastTwo {

    public static int lastTwo(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(lastTwo("hixxhi"));
        System.out.println(lastTwo("xaxxaxaxx"));
        System.out.println(lastTwo("xxxx"));

    }
}

