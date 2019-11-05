import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AsciValues {
    public static void listASCII(){
        for (int i=0 ; i<256 ; i++){
            System.out.printf("%4s" ,(char)i );
            if(i%32==0){
                System.out.println();
            }
        }
    }
    public static void addNumberss(int num1 , int num2){
        System.out.println(num1+num2);
    }
    public static int addTwoNumbers(int num1, int num2){
        return num1+num2;
    }


    public static void main(String[] args) {
        //AsciValues.listASCII();
        addNumberss(2,3);

        int addition = addTwoNumbers(3,2);
        System.out.println(addition);
    }
}
