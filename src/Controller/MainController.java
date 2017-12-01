package Controller;

import Model.*;
import javafx.scene.control.TableView;

import java.util.ArrayList;
public class MainController {

    public static DatabaseConnection itemsDatabase;
    public static DatabaseConnection usersDatabase;

  public static void main(String[] args) {
        itemsDatabase = new DatabaseConnection("Items.db");
        usersDatabase = new DatabaseConnection("Users.db");



    }
}
