package Views;

import Controller.ManagerWelcomeController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ManagerWelcome {

    public static Scene managerWelcome() {

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

        Scene managerWelcome = new Scene(subSection, 586, 350);

        Label hello = new Label("Hello");
        hello.setTranslateX(280);
        hello.setTranslateY(20);

        Button toViewItems = new Button("View Items");
        toViewItems.setPrefSize(162, 31);
        toViewItems.setOnAction((ActionEvent ae) -> ManagerWelcomeController.toView());//stage.setScene(Login)); //once clicked, Login scene opens
        toViewItems.setTranslateX(220);
        toViewItems.setTranslateY(50);

        Button toAccounts = new Button("Accounts");
        toAccounts.setPrefSize(162, 31);
        toAccounts.setOnAction((ActionEvent ae) -> ManagerWelcomeController.viewAccounts());//stage.setScene(Login)); //once clicked, Login scene opens
        toAccounts.setTranslateX(220);
        toAccounts.setTranslateY(90);

        Button toSettings = new Button("Settings");
        toSettings.setPrefSize(162, 31);
        toSettings.setOnAction((ActionEvent ae) -> ManagerWelcomeController.goToSettings());//stage.setScene(Login)); //once clicked, Login scene opens
        toSettings.setTranslateX(220);
        toSettings.setTranslateY(130);

        Button toLogin = new Button("Logout");
        toLogin.setPrefSize(90, 31);
        toLogin.setOnAction((ActionEvent ae) -> ManagerWelcomeController.goToLogin());//stage.setScene(Login)); //once clicked, Login scene opens
        toLogin.setTranslateX(490);
        toLogin.setTranslateY(230);

        subSection.getChildren().addAll(topSection, hello, toLogin, toAccounts, toViewItems, toSettings);

        return managerWelcome;
    }
}
