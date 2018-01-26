package Controller;

import Model.UserService;
import Model.Users;
import Views.Main;
import Views.ManagerWelcome;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ManagingAccountsController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void toWelcome (){

        Main.stage.setScene(ManagerWelcome.managerWelcome());

    }

}
