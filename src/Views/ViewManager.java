package Views;

import Controller.MainController;
import Controller.ViewManagerController;
import Controller.ViewUsersController;
import Model.Items;
import Model.ItemsService;
import Model.Users;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ViewManager {

    public static Scene viewManager() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        Label name = new Label("Manager");
        name.setTranslateX(2);
        name.setTranslateY(70);

        topSection.getChildren().setAll(name);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Button toEdit = new Button("Edit");
        toEdit.setPrefSize(90, 31);
        toEdit.setOnAction(ae -> ViewManagerController.toEdit());
        toEdit.setTranslateX(490);
        toEdit.setTranslateY(195);

        Button toWelcome = new Button("Back");
        toWelcome.setPrefSize(90, 31);
        toWelcome.setOnAction(ae -> ViewManagerController.toWelcome());
        toWelcome.setTranslateX(490);
        toWelcome.setTranslateY(230);

        Scene viewScene = new Scene(subSection, 586, 350);

        TableView<Items> itemsTableView = new TableView<>();
        itemsTableView.setPrefSize(460, 270);

        TableColumn<Items, String> itemIDColumn = new TableColumn<>("Item ID");
        itemIDColumn.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        itemsTableView.getColumns().add(itemIDColumn);

        TableColumn<Items, String> itemNameColumn = new TableColumn<>("Item");
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        itemsTableView.getColumns().add(itemNameColumn);

        TableColumn<Items, String> sellingPriceColumn = new TableColumn<>("Selling Price");
        sellingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("sellingPrice"));
        itemsTableView.getColumns().add(sellingPriceColumn);

        TableColumn<Items, String> buyingPriceColumn = new TableColumn<>("Buying Price");
        buyingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("buyingPrice"));
        itemsTableView.getColumns().add(buyingPriceColumn);

        TableColumn<Items, String> groupColumn = new TableColumn<>("Group");
        groupColumn.setCellValueFactory(new PropertyValueFactory<>("groups"));
        itemsTableView.getColumns().add(groupColumn);

        TableColumn<Items, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        itemsTableView.getColumns().add(quantityColumn);

        TableColumn<Items, String> itemIMGColumn = new TableColumn<>("itemIMG");
        itemIMGColumn.setCellValueFactory(new PropertyValueFactory<>("itemIMG"));
        itemsTableView.getColumns().add(itemIMGColumn);

        itemsTableView.setItems(FXCollections.observableArrayList(ItemsService.selectAll(MainController.itemsDatabase)));

        subSection.getChildren().setAll(toWelcome, topSection, toEdit, itemsTableView);
        return viewScene;
    }
}
