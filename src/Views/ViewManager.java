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

        Button addItem = new Button("Add Item");
        addItem.setPrefSize(90, 31);
        addItem.setOnAction(ae -> ViewManagerController.Temp());
        addItem.setTranslateX(490);
        addItem.setTranslateY(125);

        Button toEdit = new Button("Edit");
        toEdit.setPrefSize(90, 31);
        toEdit.setOnAction(ae -> ViewManagerController.toEdit());
        toEdit.setTranslateX(490);
        toEdit.setTranslateY(160);

        Button deleteItem = new Button("Delete Item");
        deleteItem.setPrefSize(90, 31);
        deleteItem.setOnAction(ae -> ViewManagerController.Temp());
        deleteItem.setTranslateX(490);
        deleteItem.setTranslateY(195);

        Button toWelcome = new Button("Back");
        toWelcome.setPrefSize(90, 31);
        toWelcome.setOnAction(ae -> ViewManagerController.toWelcome());
        toWelcome.setTranslateX(490);
        toWelcome.setTranslateY(230);

        Scene viewScene = new Scene(subSection, 586, 350);

        TableView<Items> itemsTableView = new TableView<>();
        itemsTableView.setPrefSize(490, 270);

        TableColumn<Items, String> itemIDColumn = new TableColumn<>("ItemID");
        itemIDColumn.setCellValueFactory(new PropertyValueFactory<>("itemID"));
        itemIDColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.12));
        itemIDColumn.setResizable(false);
        itemsTableView.getColumns().add(itemIDColumn);

        TableColumn<Items, String> itemIMGColumn = new TableColumn<>("itemIMG");
        itemIMGColumn.setCellValueFactory(new PropertyValueFactory<>("itemIMG"));
        itemIMGColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.14));
        itemIMGColumn.setResizable(false);
        itemsTableView.getColumns().add(itemIMGColumn);

        TableColumn<Items, String> itemNameColumn = new TableColumn<>("Item");
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        itemNameColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.14));
        itemNameColumn.setResizable(false);
        itemsTableView.getColumns().add(itemNameColumn);

        TableColumn<Items, String> sellingPriceColumn = new TableColumn<>("Selling Price");
        sellingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("sellingPrice"));
        sellingPriceColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.18));
        sellingPriceColumn.setResizable(false);
        itemsTableView.getColumns().add(sellingPriceColumn);

        TableColumn<Items, String> buyingPriceColumn = new TableColumn<>("Buying Price");
        buyingPriceColumn.setCellValueFactory(new PropertyValueFactory<>("buyingPrice"));
        buyingPriceColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.18));
        buyingPriceColumn.setResizable(false);
        itemsTableView.getColumns().add(buyingPriceColumn);

        TableColumn<Items, String> groupColumn = new TableColumn<>("Group");
        groupColumn.setCellValueFactory(new PropertyValueFactory<>("groups"));
        groupColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.10));
        groupColumn.setResizable(false);
        itemsTableView.getColumns().add(groupColumn);

        TableColumn<Items, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        quantityColumn.prefWidthProperty().bind(itemsTableView.widthProperty().multiply(0.16));
        quantityColumn.setResizable(false);
        itemsTableView.getColumns().add(quantityColumn);

        itemsTableView.setItems(FXCollections.observableArrayList(ItemsService.selectAll(MainController.itemsDatabase)));

        subSection.getChildren().setAll(toWelcome, topSection, toEdit, addItem, itemsTableView, deleteItem);
        return viewScene;
    }
}
