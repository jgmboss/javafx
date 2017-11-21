import Model.*;
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

public class Main {

    //Under 'public class Main extends Application {'

    public static DatabaseConnection itemsDatabase;
    public static DatabaseConnection usersDatabase;

    public static void main(String[] args) {
        itemsDatabase = new DatabaseConnection("Items.db");
        usersDatabase = new DatabaseConnection("Users.db");

        ArrayList<Items> testList = new ArrayList<>();

        ItemsService.selectAll(testList, itemsDatabase);

        for (Items c : testList) {
            System.out.println(c);
        }


        ArrayList<Users> testList2 = new ArrayList<>();

        UserService.selectAll(testList2, usersDatabase);

        for (Users d : testList2) {
            System.out.println(d);
        }
    }
}


