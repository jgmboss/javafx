package Controller;

import Views.Login;
import Views.Main;
import Views.SignUp;

public class SignUpController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }

    public static void madeNewAccount(){
        //store input into database
        Main.stage.setScene(Login.login());
    }
}
