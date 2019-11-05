public class ReversedStringEx {
    public static void main(String[] args) {
        // how to reverse  a string
        //Method-1
        String str="Hello World";
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb.reverse());


        // Method-2
        String str1="Hello World";
        char[] charArrays= str.toCharArray();
        for(int i=charArrays.length-1; i >=0; i--){
            System.out.println(charArrays[i]);
        }
    }
}
