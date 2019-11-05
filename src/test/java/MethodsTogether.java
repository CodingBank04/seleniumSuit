public class MethodsTogether {
    static void printNumbers(){
        int start=1;
        while (start<100){
            //System.out.println(start);
            start++;
        }
    }

    public static void main(String[] args) {
        printNumbers();
        MethodsTogether.printNumbers();
     }
}
