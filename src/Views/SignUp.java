package Views;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SignUp {

    public static Scene signUp() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586,263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene signUpScene = new Scene(subSection, 586, 350);
        Label signUptxt = new Label("Sign Up");
        signUptxt.setTranslateX(242);
        signUptxt.setTranslateY(30);

        Label usernameTxt = new Label("New Username");
        usernameTxt.setTranslateX(50);
        usernameTxt.setTranslateY(40);

        TextField usernameIn = new TextField();
        usernameIn.setPromptText("Username");
        usernameIn.setTranslateX(50);
        usernameIn.setTranslateY(60);

        Label passTxt = new Label("New Password");
        passTxt.setTranslateX(50);
        passTxt.setTranslateY(90);

        PasswordField passIn = new PasswordField();
        passIn.setPromptText("Password");
        passIn.setTranslateX(50);
        passIn.setTranslateY(110);

        Label passTxt2 = new Label("Re-enter New Password");
        passTxt2.setTranslateX(50);
        passTxt2.setTranslateY(140);

        PasswordField passIn2 = new PasswordField();
        passIn2.setPromptText("Password");
        passIn2.setTranslateX(50);
        passIn2.setTranslateY(160);

        Label fNameTxt = new Label("First Name");
        fNameTxt.setTranslateX(250);
        fNameTxt.setTranslateY(60);

        TextField fNameIn = new TextField();
        fNameIn.setPromptText("Enter here");
        fNameIn.setTranslateX(250);
        fNameIn.setTranslateY(80);

        Label lNameTxt = new Label("Last Name");
        lNameTxt.setTranslateX(250);
        lNameTxt.setTranslateY(110);

        TextField lNameIn = new TextField();
        lNameIn.setPromptText("Enter here");
        lNameIn.setTranslateX(250);
        lNameIn.setTranslateY(130);

        Button toLogin2 = new Button("Enter");
        toLogin2.setPrefSize(162, 31);
        toLogin2.setOnAction((ActionEvent ae) -> System.out.println("It works!"));//stage.setScene(Login)); //once clicked, Login scene opens
        toLogin2.setTranslateX(212);
        toLogin2.setTranslateY(192);

        Button toLogin = new Button("Back");
        toLogin.setPrefSize(90, 31);
        toLogin.setOnAction((ActionEvent ae) -> System.out.println("It works!")); //once clicked, Login scene opens
        toLogin.setTranslateX(490);
        toLogin.setTranslateY(230);

        subSection.getChildren().addAll(toLogin, lNameIn, lNameTxt, toLogin2, fNameIn, fNameTxt, passIn2,passTxt2,passIn,passTxt, usernameIn, usernameTxt, signUptxt);

        return signUpScene;
    }
}
