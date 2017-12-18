package Controller;

import Views.*;

public class ManagerWelcomeController {

    public static void Temp (){

        System.out.println("It works!");

    }

    public static void viewAccounts(){
        Main.stage.setScene(ManagingAccounts.managingAccounts());

    }

    public static void goToSettings(){
        Main.stage.setScene(SettingsManager.settingsManager());

    }
    public static void goToLogin(){
        Main.stage.setScene(Login.login());

    }
    public static void toView(){
        Main.stage.setScene(ViewManager.viewManager());

    }

}
