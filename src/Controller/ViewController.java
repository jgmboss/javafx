package Controller;

import Model.*;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class ViewController {
    private TableView<Items> itemsTable;

    private DatabaseConnection database;
    private ArrayList<Items> allToppingViews = new ArrayList<>();

    public ViewController(TableView<Items> itemsTable) {

        System.out.println("Initialising main controller...");

        this.itemsTable = itemsTable;

        database = new DatabaseConnection("Items.db");
    }

}

