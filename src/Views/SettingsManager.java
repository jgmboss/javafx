package Views;

import Controller.LoginController;
import Controller.SettingsController;
import Controller.SettingsManagerController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import static Controller.LoginController.currentUserLN;

public class SettingsManager {
    public static TextField usernameIN;
    public static PasswordField newPassIN;
    public static PasswordField newPassIN2;

    public static Scene settingsManager() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        String currentUser = LoginController.currentUserFN;
        System.out.println(currentUser);

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

        Scene settingScene = new Scene(subSection, 586, 350);

        Label settingsTxt = new Label("Settings");
        settingsTxt.setTranslateX(270);
        settingsTxt.setTranslateY(20);

        Label newPasswordTxt = new Label("New Password");
        newPasswordTxt.setTranslateX(355);
        newPasswordTxt.setTranslateY(50);

        newPassIN = new PasswordField();
        newPassIN.setPromptText("Enter new Password");
        newPassIN.setTranslateX(330);
        newPassIN.setTranslateY(70);

        Label renterPasswordTxt = new Label("Renter Password");
        renterPasswordTxt.setTranslateX(355);
        renterPasswordTxt.setTranslateY(95);

        newPassIN2 = new PasswordField();
        newPassIN2.setPromptText("Enter new Password");
        newPassIN2.setTranslateX(330);
        newPassIN2.setTranslateY(115);

        Label cangeUserNameTxt = new Label("New Username");
        cangeUserNameTxt.setTranslateX(355);
        cangeUserNameTxt.setTranslateY(140);

        usernameIN = new TextField();
        usernameIN.setPromptText("Enter Your Password");
        usernameIN.setTranslateX(330);
        usernameIN.setTranslateY(160);

        Pane infoPane = new Pane();
        infoPane.setPrefSize(260, 145);
        infoPane.setTranslateX(20);
        infoPane.setTranslateY(35);
        infoPane.setStyle("-fx-background-color: White;");

        Label usernameTxt = new Label("UserName: "+ Login.usernameIn.getText());
        usernameTxt.setTranslateX(120);
        usernameTxt.setTranslateY(30);

        Label firstName = new Label("First Name: " + currentUser);
        firstName.setTranslateX(120);
        firstName.setTranslateY(45);

        String currentUserLast = currentUserLN;
        System.out.println(currentUserLast);
        Label surname = new Label("Surname: " + currentUserLast);
        surname.setTranslateX(120);
        surname.setTranslateY(60);

        infoPane.getChildren().setAll(usernameTxt, firstName, surname);

        Button confirm = new Button("Confirm");
        confirm.setPrefSize(162, 31);
        confirm.setOnAction((ae) -> SettingsManagerController.changeDetail());
        confirm.setTranslateX(212);
        confirm.setTranslateY(192);

        Button toWelcome = new Button("Back");
        toWelcome.setPrefSize(90, 31);
        toWelcome.setOnAction((ae) -> SettingsManagerController.toWelcome());
        toWelcome.setTranslateX(490);
        toWelcome.setTranslateY(230);

        subSection.getChildren().setAll(settingsTxt,newPasswordTxt, renterPasswordTxt, cangeUserNameTxt, infoPane, confirm, toWelcome, newPassIN, newPassIN2, usernameIN, topSection);

        return settingScene;
    }
}


