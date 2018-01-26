package Controller;

import Model.UserService;
import Model.Users;
import Views.*;

public class WelcomeController {

    public static void Temp (){

        System.out.println("It works!");

    }

    public static void toView(){

        Main.stage.setScene(ViewUsers.viewUsers());

    }

    public static void toSettings(){

        Main.stage.setScene(Settings.settings());

    }

    public static void toLogin(){

        Main.stage.setScene(Login.login());

    }

}
