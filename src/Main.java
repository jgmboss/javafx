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
    
Scene start;
Scene login;
Scene signUp;
Scene managerWelcome;
Scene welcome;
Scene managingAccounts;
Scene settings;
Scene view;
Scene viewOne; 
Scene edit;
    
    //Under 'public class Main extends Application {'
    @Override
    public void Start (Stage stage) throws Exception {
        
        stage.setTitle("Inventory");
        stage.setScene(start);
        stage.show();

        //scene.getStylesheets().add("CSS.css");

        Pane subSection = new Pane(); //this will be the template for all the scenes so it looks professional 
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle( "-fx-background-color: Darkgray;"
        );
        
        Scene start = new Scene(subSection, 586, 350); //creates new scene with my template and the size of the scene (which will always be the same)
        //these are things that will be in the start scene
        Button toLogin = new Button("Enter");
        toLogin.setPrefSize(162, 31);
        toLogin.setOnAction((ActionEvent ae) -> stage.setScene(login)); //once clicked, login scene opens
        toLogin.setTranslateX(212);
        toLogin.setTranslateY(192);
        
        Label welcome = new Label("Welcome to the");
        Label inventory = new Label("inventory application");
        welcome.setTranslateX(230);
        welcome.setTranslateY(38);
        inventory.setTranslateX(209);
        inventory.setTranslateY(57);
        
        
        Scene login = new Scene(subSection, 586, 350);
        
        Label login = new Label("Login");
        welcome.setTranslateX(230);
        welcome.setTranslateY(38);
        
        Label login = new Label("Username");
        welcome.setTranslateX(230);
        welcome.setTranslateY(42);
        //input code
        
        Label login = new Label("Password");
        welcome.setTranslateX(230);
        welcome.setTranslateY(59);
        //input code
        
        Button toWelcome = new Button("Enter");
        toWelcome.setPrefSize(162, 31);
        toWelcome.setOnAction((ActionEvent ae) -> stage.setScene(login)); //once clicked, login scene opens
        toWelcome.setTranslateX(212);
        toWelcome.setTranslateY(192);
        
        Button toSignup = new Button("Sign Up");
        toSignup.setPrefSize(162, 31);
        toSignup.setOnAction((ActionEvent ae) -> stage.setScene(signUp)); //once clicked, login scene opens
        toSignup.setTranslateX(560);
        toSignup.setTranslateY(300);
        
        
        Scene signUp = new Scene(subSection, 586, 350);
        Label login = new Label("Login");
        welcome.setTranslateX(230);
        welcome.setTranslateY(38);
        
        Scene managerWelcome = new Scene(subSection, 586, 350);
        
        
        Scene welcome = new Scene(subSection, 586, 350);
        
        
        Scene managingAccounts = new Scene(subSection, 586, 350);
        
        
        Scene settings = new Scene(subSection, 586, 350);
        
        
        Scene view = new Scene(subSection, 586, 350);
        
        
        Scene viewOne = new Scene(subSection, 586, 350);
        
        
        Scene edit = new Scene(subSection, 586, 350);
        
       // centerPane.setStyle("-fx-background-color: red");
        start = new Scene(subSection
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

