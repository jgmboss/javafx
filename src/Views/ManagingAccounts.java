package Views;

import Controller.ManagingAccountsController;
import Model.DatabaseConnection;
import Model.UserService;
import Model.Users;
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

//            TableView accountsTable = new TableView();
//            accountsTable.setPrefSize(100, 90);
//            TableColumn userID = new TableColumn("User ID");
//            TableColumn userName = new TableColumn("UserName");
//            TableColumn userFN = new TableColumn("First Name");
//            TableColumn userLN = new TableColumn("Last Name");
//            TableColumn manager = new TableColumn("Manager");
//            TableColumn active = new TableColumn("Active");

            TableView accountsTable = new TableView<>();
            accountsTable.setPrefSize(400, 300);
            accountsTable.setItems(FXCollections.observableArrayList());

            TableColumn userIDColumn = new TableColumn<>("UserID");
            userIDColumn.setCellValueFactory(new PropertyValueFactory<>("userID"));
            accountsTable.getColumns().add(userIDColumn);

            TableColumn userNameColumn = new TableColumn<>("UserName");
            userNameColumn.setCellValueFactory(new PropertyValueFactory<>("UserName"));
            accountsTable.getColumns().add(userNameColumn);

            TableColumn firstNameColumn = new TableColumn<>("First Name");
            firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
            accountsTable.getColumns().add(firstNameColumn);

            TableColumn lastNameColumn = new TableColumn<>("Last Name");
            lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
            accountsTable.getColumns().add(lastNameColumn);

            TableColumn managerColumn = new TableColumn<>("Manager");
            managerColumn.setCellValueFactory(new PropertyValueFactory<>("anager"));
            accountsTable.getColumns().add(managerColumn);

            TableColumn activeColumn = new TableColumn<>("Active");
            activeColumn.setCellValueFactory(new PropertyValueFactory<>("active"));
            accountsTable.getColumns().add(activeColumn);

            TableColumn emailColumn = new TableColumn<>("Email");
            emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
            accountsTable.getColumns().add(emailColumn);


            TableView tableView = new TableView();
            String coulmns[] = {
                    "User ID",
                    "UserName",
                    "First Name",
                    "Last Name"};

            //table with accounts and their information
            //labels with column headings
            // connect to users table
            // button to go back to manager welcome
            subSection.getChildren().setAll(accountsTable, toManagerWelcome, topSection);
            return managingAccountsScene;
        }
    }
