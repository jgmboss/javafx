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

        Button toEdit = new Button("Edit");
        toEdit.setPrefSize(90, 31);
        toEdit.setOnAction(ae -> ViewManagerController.toEdit());
        toEdit.setTranslateX(490);
        toEdit.setTranslateY(195);

        Button toWelcome = new Button("Back");
        toWelcome.setPrefSize(90, 31);
        toWelcome.setOnAction(ae -> ViewManagerController.toWelcome());
        toWelcome.setTranslateX(490);
        toWelcome.setTranslateY(230);

        Scene viewScene = new Scene(subSection, 586, 350);



        subSection.getChildren().setAll(toWelcome, topSection, toEdit);
        return viewScene;
    }
}
