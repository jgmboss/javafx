package Views;

import Controller.ViewManagerController;
import Controller.ViewUsersController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ViewManager {

    public static Scene viewManager() {

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

        Button welcome = new Button("Back");
        welcome.setPrefSize(90, 31);
        welcome.setOnAction(ae -> ViewManagerController.toWelcome());
        welcome.setTranslateX(490);
        welcome.setTranslateY(230);

        Scene viewScene = new Scene(subSection, 586, 350);



        //subSection.getChildren().
        return viewScene;
    }
}
