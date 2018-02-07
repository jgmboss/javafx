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

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void toWelcome(){

        Main.stage.setScene(ManagerWelcome.managerWelcome());

    }
    public static void toEdit(){



        Main.stage.setScene(Edit.edit());

    }

    @SuppressWarnings("Duplicates")
    public static void toAddItem() {


           Items selectedItem = iteList.getSelectionModel().getSelectedItem();
            Topping selectedPizzaTopping = pizzaToppingList.getSelectionModel().getSelectedItem();

            if (selectedPizza == null) {
                displayError("No pizza has been selected.");
                return;
            }
            if (selectedPizzaTopping == null) {
                displayError("No topping has been selected.");
                return;
            }

            PizzaService.deletePizzaTopping(selectedPizza.getId(), selectedPizzaTopping.getId(), database);
            updateLists(selectedPizza != null ? selectedPizza.getId() : 0, selectedPizzaTopping.getId());

        }

    }


    public void itemSelected(Items selectedItem)
    {
        currentToppings.clear();

        ArrayList<Integer> currentToppingIds = new ArrayList<>();

        if (selectedItem != null) {
            PizzaService.selectPizzaToppings(selectedItem, currentToppings, database);
            for (PizzaTopping pt : currentToppings) {
                currentToppingIds.add(pt.getToppingId());
            }
        }

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
}
