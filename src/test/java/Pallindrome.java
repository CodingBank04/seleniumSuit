public class Pallindrome {
    public static String isPallindrome(String word){
        String reversed="";
        String answer="";
        for (int i=word.length()-1; i>=0 ; i--) {
            reversed = reversed + word.charAt(i);
        }
            if(reversed.equals(word)){
                answer=" Is Pallindrome";
            }
            else{
                answer=" is not pallindrome";
            }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("mom"));
        System.out.println(isPallindrome("march"));
    }
}
