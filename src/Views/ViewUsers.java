package Views;

import Controller.MainController;
import Controller.ViewUsersController;
import Model.Users;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

public class ViewUsers {

    public static Scene viewUsers() {
        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        Label name = new Label("Name");
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

        Button welcome = new Button("Back");
        welcome.setPrefSize(90, 31);
        welcome.setOnAction(ae -> ViewUsersController.toWelcome());
        welcome.setTranslateX(490);
        welcome.setTranslateY(230);

        Label itemsView = new Label("View Items");
        itemsView.setTranslateX(250);
        itemsView.setTranslateY(20);

        //table with items info
        TableView accountsTable = new TableView();
        accountsTable.setTranslateX(2);
        accountsTable.setTranslateY(25);
        TableColumn userID = new TableColumn("User ID");
        TableColumn userName = new TableColumn("UserName");
        TableColumn userFN = new TableColumn("First Name");
        TableColumn userLN = new TableColumn("Last Name");
        TableColumn manager = new TableColumn("Manager");
        TableColumn active = new TableColumn("Active");

        subSection.getChildren().setAll(welcome, itemsView, topSection, accountsTable);
        return viewScene;
    }
}