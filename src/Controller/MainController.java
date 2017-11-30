package Controller;

import Model.*;
import javafx.scene.control.TableView;

import java.util.ArrayList;

/*public class MainController {

    private TableView<Model.Users> Users;

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
*/