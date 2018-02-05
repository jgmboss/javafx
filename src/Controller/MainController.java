package Controller;

import Model.DatabaseConnection;
import Views.Login;
import Views.Main;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class MainController {

    public static DatabaseConnection itemsDatabase;
    public static DatabaseConnection usersDatabase;

    public static void Temp (){ //used for testing the buttons/ connection between the view class and controller class

        System.out.println("It works!");

    }

    public static void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Are you sure you want to exit?");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        } else {
            we.consume();
        }

    }

  public static void initiateDatabases() {
        itemsDatabase = new DatabaseConnection("Items.db");
        usersDatabase = new DatabaseConnection("Users.db");
  }

    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
        initiateDatabases();
    }





}



