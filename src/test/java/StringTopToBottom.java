import java.util.Scanner;

public class StringTopToBottom {
    public static void stringTopToBottom(String word){
        for(int i=0 ; i<word.length();i++){
            System.out.println(word.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter valid string value:");
        String input= scanner.nextLine();
        stringTopToBottom(input);

    }
}
