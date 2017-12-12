package Controller;

import Model.DatabaseConnection;
import Views.Login;
import Views.Main;
public class MainController {

    public static DatabaseConnection itemsDatabase;
    public static DatabaseConnection usersDatabase;

  public static void initiateDatabases() {
        itemsDatabase = new DatabaseConnection("Items.db");
        usersDatabase = new DatabaseConnection("Users.db");
  }

    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }





}
