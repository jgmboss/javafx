package Views;

import Controller.LoginController;
import Controller.WelcomeController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Welcome {

    public static Scene welcome() {

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

        Label name = new Label("Name");
        name.setTranslateX(2);
        name.setTranslateY(70);

        topSection.getChildren().setAll(name);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene welcomeScene = new Scene(subSection, 586, 350);

        Label helloTxt = new Label( "Hello");
        helloTxt.setTranslateX(280);
        helloTxt.setTranslateY(20);

        Button toView = new Button("View Items");
        toView.setPrefSize(162, 31);
        toView.setOnAction((ae) -> WelcomeController.toView());
        toView.setTranslateX(220);
        toView.setTranslateY(50);

        Button toSettings = new Button("Settings");
        toSettings.setPrefSize(162, 31);
        toSettings.setOnAction((ae) -> WelcomeController.toSettings());
        toSettings.setTranslateX(220);
        toSettings.setTranslateY(90);

        Button toLogin = new Button("Log Out");
        toLogin.setPrefSize(90, 31);
        toLogin.setOnAction((ae) -> WelcomeController.toLogin());
        toLogin.setTranslateX(490);
        toLogin.setTranslateY(230);

        subSection.getChildren().addAll(helloTxt, toLogin, toView, toSettings, topSection);

        return welcomeScene;
    }
}
