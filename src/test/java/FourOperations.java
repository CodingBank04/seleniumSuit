public class FourOperations {
    public static int addTwoNumbers(int number1 , int number2){
        return number1 +number2;

    }
    static int multiplyTwoNumbers(int number1, int number2){
        return number1*number2;
    }
   static double divideTwoNumbers(int number1 , int number2){
        return number1/number2;
   }
   static int substraction(int number1, int number2){
        return number1-number2;
   }
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(2,4));
        System.out.println(multiplyTwoNumbers(4,3));
        System.out.println(divideTwoNumbers(12,7));
        System.out.println(substraction(9,3));
    }
}
