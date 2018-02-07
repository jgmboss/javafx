package Views;

import Controller.LoginController;
import Controller.MainController;
import Controller.ViewManagerController;
import Controller.ViewUsersController;
import Model.Items;
import Model.ItemsService;
import Model.UserService;
import Model.Users;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ViewUsers {

    private static ListView<Items> itemsListView = new ListView<>();


    public static Scene viewUsers() {
        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        String currentUser = LoginController.currentUserFN;
        System.out.println(currentUser);

        Label name = new Label(currentUser);
        name.setTranslateX(2);
        name.setTranslateY(70);

        topSection.getChildren().setAll(name);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

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

        Button welcome = new Button("Back");
        welcome.setPrefSize(90, 31);
        welcome.setOnAction(ae -> ViewUsersController.toWelcome());
        welcome.setTranslateX(490);
        welcome.setTranslateY(230);

        Label itemsView = new Label("View Items");
        itemsView.setTranslateX(250);
        itemsView.setTranslateY(20);

        //table with items info


        subSection.getChildren().setAll(welcome, itemsView, topSection,itemsTableView);
        return viewScene;
    }
}