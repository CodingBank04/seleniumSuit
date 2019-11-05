public class StringBackward {
    public static void backwordString(String str){

        for (int i=str.length()-1 ; i>=0; i--){
            System.out.println(str.charAt(i));

        }
    }
    public static String writeBackwar(String str){
        String reversed="";
        for(int i=str.length()-1; i>=0; i--){
            reversed= reversed +str.charAt(i);

        }
        return reversed;
    }

    public static void main(String[] args) {
        backwordString("123");
        System.out.println(writeBackwar("abc"));
    }
}
