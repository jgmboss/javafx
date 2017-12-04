package Views;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class login {

    public void login(Stage stage) throws Exception {

        stage.setTitle("Inventory");
        stage.show();

        Pane subSection = new Pane();

        Scene login = new Scene(subSection, 586, 350);
        Label loginTxt = new Label("Login");
        loginTxt.setTranslateX(230);
        loginTxt.setTranslateY(38);

        Label userNametxt = new Label("Username");
        userNametxt.setTranslateX(230);
        userNametxt.setTranslateY(42);
        //input code
        TextField usernameIn = new TextField();
        usernameIn.setPromptText("Enter Your Username");

        Label pass = new Label("Password");
        pass.setTranslateX(230);
        pass.setTranslateY(59);
        //input code
        PasswordField passwordIn = new PasswordField();
        passwordIn.setPromptText("Enter Your Password");

        //passwordIn.setOnAction(new EventHandler<passwordHasher>() {

        //   }

        Button toWelcome = new Button("Enter");
        toWelcome.setPrefSize(162, 31);
        toWelcome.setOnAction((ActionEvent ae) -> stage.setScene(login)); //once clicked, login scene opens
        toWelcome.setTranslateX(212);
        toWelcome.setTranslateY(192);

        Button toSignup = new Button("Sign Up");
        toSignup.setPrefSize(162, 31);
        toSignup.setOnAction((ActionEvent ae) -> System.out.println("It works!"));//stage.setScene(signUp)); //once clicked, login scene opens
        toSignup.setTranslateX(560);
        toSignup.setTranslateY(300);

//
    }
}
