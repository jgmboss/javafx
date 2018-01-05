package Views;

import Controller.LoginController;
import Controller.OneItemSelectController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class OneItemSelected {


    public static Scene OneItemSelected() {

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

        Pane infoBox = new Pane();
        infoBox.setPrefSize(300, 30);
        infoBox.setTranslateX(10);
        infoBox.setTranslateY(10);

        SplitPane details = new SplitPane();

        Rectangle description = new Rectangle();
        description.setX(50);
        description.setY(50);
        description.setWidth(50);
        description.setHeight(50);
        description.setArcWidth(20);
        description.setArcHeight(20);
        Text descriptionWriting = new Text();

        StackPane shapewriting = new StackPane();
        shapewriting.getChildren().setAll(description, descriptionWriting);


        infoBox.getChildren().setAll(details, shapewriting);

        Label userManager = new Label("name");
        userManager.setTranslateX(2);
        userManager.setTranslateY(70);

        Pane subSection = new Pane();
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene oneItemSelectedScene = new Scene(subSection, 586, 350);

        Label viewTxt = new Label ("View Items");
        viewTxt.setTranslateX(10);
        viewTxt.setTranslateX(10);

        Button toView = new Button();
        toView.setPrefSize(162, 31);
        toView.setOnAction((ae) -> OneItemSelectController.toView());
        toView.setTranslateX(212);
        toView.setTranslateY(192);

        subSection.getChildren().setAll(viewTxt, infoBox, topSection);

        return oneItemSelectedScene;

    }
}
