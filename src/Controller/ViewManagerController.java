package Controller;

import Model.*;
import Views.Main;
import Views.Welcome;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class ViewManagerController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void toWelcome(){

        Main.stage.setScene(Welcome.welcome());

    }

    private TableView<Items> itemsTable;

    private DatabaseConnection database;
    private ArrayList<Items> allItemsView = new ArrayList<>();

    /*public ViewController(TableView<Items> itemsTable) {

        System.out.println("Initialising main controller...");

        this.itemsTable = itemsTable;

        database = new DatabaseConnection("Items.db");

    }

    public static void getuserFN{

        String userFN = UserService.selectById();
    }*/
}
