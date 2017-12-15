package Views;
//import Model.*;
import Controller.MainController;
import Model.DatabaseConnection;
import Model.Items;
import Model.ItemsService;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.Console;
import java.util.ArrayList;
import java.util.Optional;


public class Main extends Application {
    public static DatabaseConnection database;

    public static Stage stage;

    //Under 'public class Views.Main extends Application {'
    @Override
    public void start (Stage stage) throws Exception {

        Main.stage = stage;

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane subSection = new Pane(); //this will be the template for all the scenes so it looks professional
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586,263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene startScene = new Scene(subSection, 586, 350); //creates new scene with my template and the size of the scene (which will always be the same)
        //these are things that will be in the startScene scene

        Button toLogin = new Button("Enter");
        toLogin.setPrefSize(162, 31);
        toLogin.setOnAction((ae) -> MainController.gotoLoginScreen()); //once clicked, Login scene opens
        toLogin.setTranslateX(212);
        toLogin.setTranslateY(192);

        subSection.getChildren().add(toLogin);

        Label welcomeTxt = new Label("Welcome to the");
        Label inventory = new Label("inventory application");
        welcomeTxt.setTranslateX(250);
        welcomeTxt.setTranslateY(38);
        inventory.setTranslateX(235);
        inventory.setTranslateY(57);

        subSection.getChildren().add(welcomeTxt);
        subSection.getChildren().add(inventory);

        Image testImage = new Image("Resources/trumpet.jpg");
        ImageView testImageView = new ImageView(testImage);
        testImageView.setScaleX(0.2);
        testImageView.setScaleY(0.2);
        subSection.getChildren().add(testImageView);


        Main.stage.setScene(startScene);

    }

    public void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Inventory");
        alert.setHeaderText("Are you sure you want to exit?");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            database.disconnect();
            System.exit(0);
        } else {
            we.consume();
        }

    }
    public static void main(String[] args) {
        MainController.initiateDatabases();
        launch(args);
    }
}
