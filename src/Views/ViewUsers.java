package Views;

import Controller.MainController;
import Model.Users;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ViewUsers {

    public static Scene ViewUsers() {
      Main.stage.setTitle("Inventory");
        Main.stage.show();

    Pane topSection = new Pane();
        topSection.setPrefSize(586, 87);
        topSection.setTranslateX(0);
        topSection.setTranslateY(-87);

    Label user = new Label(ViewUsersController.userUN);
        user.setTranslateX(2);
        user.setTranslateY(70);

    Pane subSection = new Pane();
    //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

    Scene viewScene = new Scene(subSection, 586, 350);

    //subSection.getChildren().
        return viewScene;
}
