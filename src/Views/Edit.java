package Views;

import Controller.EditController;
import Controller.OneItemSelectController;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class Edit {


    public static Scene edit() {

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

        Pane infoBox = new Pane();
        infoBox.setPrefSize(300, 30);
        infoBox.setTranslateX(10);
        infoBox.setTranslateY(10);

        SplitPane details = new SplitPane();
        infoBox.getChildren().setAll(details);

        Label userManager = new Label("name");
        userManager.setTranslateX(2);
        userManager.setTranslateY(70);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene editScene = new Scene(subSection, 586, 350);

        Label editTxt = new Label("Edit Items");
        editTxt.setTranslateX(260);
        editTxt.setTranslateY(20);

        Button confirm = new Button("Confirm");
        confirm.setPrefSize(90, 31);
        confirm.setOnAction((ae) -> EditController.confirm());
        confirm.setTranslateX(490);
        confirm.setTranslateY(195);

        Button toView = new Button("Back");
        toView.setPrefSize(90, 31);
        toView.setOnAction((ae) -> EditController.toView());
        toView.setTranslateX(490);
        toView.setTranslateY(230);

        subSection.getChildren().setAll(editTxt, infoBox, confirm, toView, topSection);

        return editScene;
    }
}