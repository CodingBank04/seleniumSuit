public class PassWord {

    public static String pswdCheck(String pswd) {
        String answer = "";

        if (pswd.length() >= 6) {
            answer = " password is Ok";

        }
        else {
            answer = "invalid password";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(pswdCheck("kdajfak"));
    }
}






 /* public static void passwordCheck (String password){

        if(password.length()>=6){
            System.out.println("valid password");
        }
        else {
            System.out.println("invalid password .psw has to be 6 characheters");
        }


    }



    public static void main(String[] args) {
        passwordCheck("abcdoef");
    }

    */
