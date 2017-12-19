package Controller;

import Views.Login;
import Views.Main;
import Views.Welcome;

public class SettingsController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void changeDetail(){
// update database
        Main.stage.setScene(Welcome.welcome());

    }
    public static void toWelcome (){

        Main.stage.setScene(Welcome.welcome());

    }


}
