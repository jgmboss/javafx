package Views;

import Controller.SettingsController;
import Controller.SettingsManagerController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SettingsManager {
    public static Scene settingsManager() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        Label userManager = new Label("Manager");
        userManager.setTranslateX(2);
        userManager.setTranslateY(70);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene settingScene = new Scene(subSection, 586, 350);

        Label settingsTxt = new Label("Settings");
        settingsTxt.setTranslateX(30);
        settingsTxt.setTranslateY(30);

        Label newPasswordTxt = new Label("New Password");
        newPasswordTxt.setTranslateX(30);
        newPasswordTxt.setTranslateY(50);

        PasswordField newPassIN = new PasswordField();
        newPassIN.setPromptText("Enter new Password");
        newPassIN.setTranslateX(220);
        newPassIN.setTranslateY(50);

        Label renterPasswordTxt = new Label("Renter Password");
        renterPasswordTxt.setTranslateX(30);
        renterPasswordTxt.setTranslateY(70);

        PasswordField  newPassIN2 = new PasswordField();
        newPassIN2.setPromptText("Enter new Password");
        newPassIN2.setTranslateX(220);
        newPassIN2.setTranslateY(70);

        Label cangeUserNameTxt = new Label("New Username");
        cangeUserNameTxt.setTranslateX(30);
        cangeUserNameTxt.setTranslateY(90);

        TextField usernameIN = new TextField();
        usernameIN.setPromptText("Enter Your Password");
        usernameIN.setTranslateX(220);
        usernameIN.setTranslateY(90);

        Pane infoPane = new Pane();
        infoPane.setTranslateX(30);
        infoPane.setTranslateY(110);

        Button confirm = new Button("Confirm");
        confirm.setOnAction((ae) -> SettingsManagerController.changeDetail());
        confirm.setTranslateX(30);
        confirm.setTranslateY(130);

        Button toWelcome = new Button("Back");
        confirm.setOnAction((ae) -> SettingsManagerController.toWelcome());
        toWelcome.setTranslateX(30);
        toWelcome.setTranslateY(150);

        subSection.getChildren().setAll(settingsTxt,newPasswordTxt, renterPasswordTxt, cangeUserNameTxt, infoPane, confirm, toWelcome);

        return settingScene;
    }
}


