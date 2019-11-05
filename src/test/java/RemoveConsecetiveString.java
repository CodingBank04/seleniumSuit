public class RemoveConsecetiveString {

    public static String removeConsecutive(String  input){
        int next=1;
        String removed="";
        for (int i=0; i<input.length();i++) {
            if (input.charAt(i) != input.charAt(next)) {
                removed = removed + input.charAt(i);
            }
            if (next < input.length()-1 ){
                next++;
            }
        }
        removed = removed + input.charAt(input.length()-1);
        return removed;
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutive("aaabbcc"));
    }

}
