package Controller;

import Views.Login;
import Views.Main;
import Views.SignUp;

public class SignUpController {
    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }

    public static void gotoSignUpScreen() {
        Main.stage.setScene(SignUp.signUp());
    }
}
