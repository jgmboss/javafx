package Controller;

import Model.DatabaseConnection;
import Model.Items;
import Views.Main;
import Views.Welcome;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class ViewUsersController {

    private DatabaseConnection database;

    private ListView<Items> itemsListView;

    private ArrayList<Items> allItemsViews = new ArrayList<>();

    public static void Temp (){

        System.out.println("It works!");

    }
    public void itemsList(ListView<Items> itemsList) {

        System.out.println("Initialising main controller...");

        this.itemsListView = itemsListView;

        database = new DatabaseConnection("Items.db");

    }

    public static void toWelcome(){

        Main.stage.setScene(Welcome.welcome());

    }

        //public static void userUN() {
          //  String u
          // return ;
        //}


    }

