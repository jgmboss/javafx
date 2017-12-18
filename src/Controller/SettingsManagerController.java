package Controller;

import Views.Main;
import Views.ManagerWelcome;
import Views.Welcome;

public class SettingsManagerController {

    public static void changeDetail(){
// update database
        Main.stage.setScene(ManagerWelcome.managerWelcome());

    }
    public static void toWelcome(){

        Main.stage.setScene(Welcome.welcome());

    }

}
