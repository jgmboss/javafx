package Views;

import Controller.LoginController;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login {

    public static TextField usernameIn;
    public static PasswordField passwordIn;

    public static Scene login() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586,263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene loginScene = new Scene(subSection, 586, 350);
        Label loginTxt = new Label("Login");
        loginTxt.setTranslateX(280);
        loginTxt.setTranslateY(20);

        Label userNametxt = new Label("Username");
        userNametxt.setTranslateX(270);
        userNametxt.setTranslateY(42);


        //input code
        usernameIn = new TextField();
        usernameIn.setPromptText("Enter Your Username");
        usernameIn.setTranslateX(220);
        usernameIn.setTranslateY(62);

        Label pass = new Label("Password");
        pass.setTranslateX(270);
        pass.setTranslateY(90);

        //input code
        passwordIn = new PasswordField();
        passwordIn.setPromptText("Enter Your Password");
        passwordIn.setTranslateX(220);
        passwordIn.setTranslateY(110);

        //passwordIn.setOnAction(new EventHandler<passwordHasher>() {

        //   }

        Button toWelcome = new Button("Enter");
        toWelcome.setPrefSize(162, 31);
        toWelcome.setOnAction((ae) -> LoginController.tryLogin());
        toWelcome.setTranslateX(212);
        toWelcome.setTranslateY(192);

        Button toSignup = new Button("Sign Up");
        toSignup.setPrefSize(90, 31);
        toSignup.setOnAction((ae) -> LoginController.newUser()); //once clicked, Signup scene opens
        toSignup.setTranslateX(490);
        toSignup.setTranslateY(230);

        subSection.getChildren().addAll( usernameIn, passwordIn, toWelcome, userNametxt, loginTxt, toSignup, pass);

        return loginScene;
        //
    }
}
