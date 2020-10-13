public class StringBits {

    // Given a string, return a new string made of every other
    // char starting with the first, so "Hello" yields "Hlo".

    public static String stringBits(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i= i+2){
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("'Hello' should return 'Hlo': " + stringBits("Hello"));
        System.out.println("'Hi' should return 'H': " + stringBits("Hi"));
        System.out.println("'Heeololeo' should return 'Hello': " + stringBits("Heeololeo"));
        System.out.println("'HiHiHi' should return 'HHH': " + stringBits("HiHiHi"));
        System.out.println("'' should return '': " + stringBits(""));
        System.out.println("'Greetings' should return 'Getns': " + stringBits("Greetings"));
        System.out.println("'Chocoate' should return 'Coot': " + stringBits("Chocoate"));
        System.out.println("'pi' should return 'p': " + stringBits("pi"));
        System.out.println("'Hello Kitten' should return 'HloKte': " + stringBits("Hello Kitten"));
        System.out.println("'hxaxpxpxy' should return 'happy': " + stringBits("hxaxpxpxy"));

    }
}
