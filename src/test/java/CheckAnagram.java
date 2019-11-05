import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    static boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
        public static void main (String[]args){
            //char str1[] = {'l','i','s','t','e','n'};
        /*char str1[] = ("integral").toCharArray();
        char str2[] = ("triangle").toCharArray();*/
            //char str2[] = {'a','p','p','l','e'};
            System.out.println("Type two words to check: ");
            Scanner word = new Scanner(System.in);
            String input1 = word.nextLine();
            String input2 = word.nextLine();
            char str1[] = input1.toCharArray();
            char str2[] = input2.toCharArray();
            if (isAnagram(str1, str2)) {
                System.out.println("The two strings are anagrams of each other.");
            } else
                System.out.println("Strings are NOT anagrams of each other.");
        }
    }

