public class ReversedArray {
    public static String reveresedArray(String word) {
        String reversed = "";
        //String answer="";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;

    }
    public static void main(String[] args) {
        System.out.println(reveresedArray("help"));
        System.out.println(reveresedArray("123"));
    }
}


