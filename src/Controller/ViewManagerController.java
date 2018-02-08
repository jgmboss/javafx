package Controller;

import Model.*;
import Views.Edit;
import Views.Main;
import Views.ManagerWelcome;
import Views.Welcome;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;

import java.util.ArrayList;
import java.util.Optional;

public class ViewManagerController {

    public static void Temp() {

        System.out.println("It works!");

    }

    public static void toWelcome() {

        Main.stage.setScene(ManagerWelcome.managerWelcome());

    }

    public static void toEdit() {


        Main.stage.setScene(Edit.edit());

    }
    public static void addItem(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add a new item");
        dialog.setHeaderText("Adding a new item");
        dialog.setContentText("Item name:");
        dialog.setContentText("Item description:");

        Optional<String> name = dialog.showAndWait();
        Optional<String> description = dialog.showAndWait();
        //Optional<Double> sellingPrice = dialog.showAndWait();

       // Items newItem = new Items(0, name.get(), description.get(), sellingPrice.get(),  )
       // if (name.isPresent()){
        //    System.out.println("Your name: " + name.get());
        //}


    }
}

    /*public void addItem() {

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add new Item");
        dialog.setHeaderText(null);
        dialog.setHeight(12);
        dialog.setWidth(30);
        dialog.setContentText("Items name:");
        dialog.setContentText("Items Description:");
        dialog.setContentText("Buying Price:");
        dialog.setContentText("Selling Price:");
        dialog.setContentText("Quantity:");
        dialog.setContentText("Group:");
        Optional<String> name = dialog.showAndWait();
        Optional<String> description = dialog.showAndWait();
        Optional<Double> buyingPrice = dialog.showAndWait();
        Optional<Double> sellingPrice = dialog.showAndWait();
        Optional<Integer> quantity = dialog.showAndWait();
        Optional<String> group = dialog.showAndWait();


        if (name.isPresent() && !name.get().equals("")){
            Items newItem = new Items(0, name.get(), description.get(), buyingPrice.get(), sellingPrice.get(), group.get(), quantity.get(), "");
            ItemsService.save(newItem, MainController.itemsDatabase);

             Items selectedItem = itemsTableView.getSelectionModel().getSelectedItem();
            updateLists(database.lastNewId(), selectedTopping != null ? selectedTopping.getId() : 0);
        }
        else {
            displayError("No name provided.");
        }

    }*/


    /*public void itemSelected(Items selectedItem)
    {
        currentToppings.clear();

        ArrayList<Integer> currentToppingIds = new ArrayList<>();

        if (selectedItem != null) {
            PizzaService.selectPizzaToppings(selectedItem, currentToppings, database);
            for (PizzaTopping pt : currentToppings) {
                currentToppingIds.add(pt.getToppingId());
            }
        }*/

    /*public void createitem() {

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add new item");
        dialog.setHeaderText(null);
        dialog.setContentText("Items's name:");
        dialog.setContentText("Items's name:");
        dialog.setContentText("Items's name:");
        Optional<String> itemName = dialog.showAndWait();
        Optional<String> itemDescription = dialog.showAndWait();
        Optional<Double> sellingPrice = dialog.showAndWait();
        Optional<String> result = dialog.showAndWait();

        if (result.isPresent() && !result.get().equals("")){
            Items newPizza = new Items(0, itemName.get(), itemDescription.get(), sellingPrice.get());
            PizzaService.save(newPizza, database);

            ToppingView selectedTopping = toppingTable.getSelectionModel().getSelectedItem();
            updateLists(database.lastNewId(), selectedTopping != null ? selectedTopping.getId() : 0);
        }
        else {
            displayError("No name provided.");
        }

    }*/


    /*public ViewController(TableView<Items> itemsTable) {

        System.out.println("Initialising main controller...");

        this.itemsTable = itemsTable;

        database = new DatabaseConnection("Items.db");

    }

    public static void getuserFN{

        String userFN = UserService.selectById();
    }*/

