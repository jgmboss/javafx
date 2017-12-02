package src;

//import Model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Main extends Application{
    //Under 'public class Main extends Application {'
    @Override
    public void start (Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 586, 350);

        stage.setTitle("Inventory");
        stage.setScene(scene);
        stage.show();

        //scene.getStylesheets().add("CSS.css");

        Pane subSection = new Pane();
        Button myButton = new Button("Enter");
        myButton.setPrefSize(162, 31);
        myButton.setOnAction((ActionEvent ae) -> System.out.println("hello"));
        myButton.setTranslateX(212);
        myButton.setTranslateY(192);
        root.getChildren().add(myButton);
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        
        subSection.setStyle( "-fx-background-color: Darkgray;"
        );
        
        Label welcome = new Label("Welcome to the");
        Label inventory = new Label("inventory application");
        welcome.setTranslateX(230);
        welcome.setTranslateY(38);
        inventory.setTranslateX(209);
        inventory.setTranslateY(57);
        
       // centerPane.setStyle("-fx-background-color: red");

    }

    /* public void accounts (Stage stage) throws Exception {

    ObservableList<Users> users = FXCollections.observableArrayList(
    new Users("Jacob", ":)", "smith"),
    new Users("Isabella", ":)", "Johnson"),
    new Users("Ethan", ":)", "Williams"),
    new Users("Emma", ":)", "Jones"),
    new Users("Michael", ":)", "brown")
    );
     */

    public static void main(String[] args) {
        launch(args);
    }
}

