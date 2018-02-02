package Views;

import Controller.LoginController;
import Controller.MainController;
import Controller.ViewManagerController;
import Controller.ViewUsersController;
import Model.Items;
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

//        TableView<Items> accountsTable = new TableView<>();
//        accountsTable.setPrefSize(415, 270);
//
//        TableColumn<Users, String> userIDColumn = new TableColumn<>("User ID");
//        userIDColumn.setCellValueFactory(new PropertyValueFactory<>("userID"));
//        accountsTable.getColumns().add(userIDColumn);
//
//        TableColumn<Users, String> userNameColumn = new TableColumn<>("User Name");
//        userNameColumn.setCellValueFactory(new PropertyValueFactory<>("userUN"));
//        accountsTable.getColumns().add(userNameColumn);
//
//        TableColumn<Users, String> firstNameColumn = new TableColumn<>("First Name");
//        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("userFN"));
//        accountsTable.getColumns().add(firstNameColumn);
//
//        TableColumn<Users, String> lastNameColumn = new TableColumn<>("Last Name");
//        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("userLN"));
//        accountsTable.getColumns().add(lastNameColumn);
//
//        TableColumn<Users, String> managerColumn = new TableColumn<>("Manager");
//        managerColumn.setCellValueFactory(new PropertyValueFactory<>("manager"));
//        accountsTable.getColumns().add(managerColumn);
//
//        TableColumn<Users, String> activeColumn = new TableColumn<>("Active");
//        activeColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
//        accountsTable.getColumns().add(activeColumn);
//
//
//        accountsTable.setItems(FXCollections.observableArrayList(UserService.selectAll(MainController.usersDatabase)));

        Button welcome = new Button("Back");
        welcome.setPrefSize(90, 31);
        welcome.setOnAction(ae -> ViewUsersController.toWelcome());
        welcome.setTranslateX(490);
        welcome.setTranslateY(230);

        Label itemsView = new Label("View Items");
        itemsView.setTranslateX(250);
        itemsView.setTranslateY(20);

        //table with items info


        subSection.getChildren().setAll(welcome, itemsView, topSection);
        return viewScene;
    }
}