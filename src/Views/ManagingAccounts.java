package Views;

import Controller.MainController;
import Controller.ManagingAccountsController;
import Model.DatabaseConnection;
import Model.UserService;
import Model.Users;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;


public class ManagingAccounts {



    public static Scene managingAccounts() {

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

            Scene managingAccountsScene = new Scene(subSection, 586, 350);

            Button toManagerWelcome = new Button("Back");
            toManagerWelcome.setPrefSize(90, 31);
            toManagerWelcome.setOnAction(ae -> ManagingAccountsController.toWelcome());
            toManagerWelcome.setTranslateX(490);
            toManagerWelcome.setTranslateY(230);


            TableView<Users> accountsTable = new TableView<>();
            accountsTable.setPrefSize(460, 270);

            TableColumn<Users, String> userIDColumn = new TableColumn<>("User ID");
            userIDColumn.setCellValueFactory(new PropertyValueFactory<>("userID"));
            accountsTable.getColumns().add(userIDColumn);

            TableColumn<Users, String> userNameColumn = new TableColumn<>("User Name");
            userNameColumn.setCellValueFactory(new PropertyValueFactory<>("userUN"));
            accountsTable.getColumns().add(userNameColumn);

            TableColumn<Users, String> firstNameColumn = new TableColumn<>("First Name");
            firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("userFN"));
            accountsTable.getColumns().add(firstNameColumn);

            TableColumn<Users, String> lastNameColumn = new TableColumn<>("Last Name");
            lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("userLN"));
            accountsTable.getColumns().add(lastNameColumn);

            TableColumn<Users, Boolean> managerColumn = new TableColumn<>("Manager");
            managerColumn.setCellValueFactory(new PropertyValueFactory<>("manager"));
            accountsTable.getColumns().add(managerColumn);

            TableColumn<Users, String> activeColumn = new TableColumn<>("Active");
            activeColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
            accountsTable.getColumns().add(activeColumn);


            accountsTable.setItems(FXCollections.observableArrayList(UserService.selectAll(MainController.usersDatabase)));

//
            subSection.getChildren().setAll(accountsTable, toManagerWelcome, topSection);
            return managingAccountsScene;
        }
    }
