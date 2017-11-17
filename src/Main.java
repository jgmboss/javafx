import Model.DatabaseConnection;
import Model.Items;
import Model.ItemsService;
import Model.UserService;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    //Under 'public class Main extends Application {'

  /*  public static DatabaseConnection itemsDatabase;

    @Override
    public void start(Stage stage) throws Exception {

        itemsDatabase = new DatabaseConnection("Items.db");


        ArrayList<Items> testList = new ArrayList<>();

        ItemsService.selectAll(testList, itemsDatabase);

        for (Items c : testList) {
            System.out.println(c);
        }
    }
*/
    public static void main(String[] args) {
        launch(args);
    }

    public static DatabaseConnection usersDatabase;

    @Override
    public void start(Stage stage) throws Exception {

        usersDatabase = new DatabaseConnection("Users.db");


        ArrayList<Items> testList = new ArrayList<>();

        UserService.selectAll(testList, usersDatabase);

        for (Items c : testList) {
            System.out.println(c);
        }
    }
}


