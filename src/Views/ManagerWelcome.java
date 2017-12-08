package Views;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ManagerWelcome {

    public static Scene managerWelcome() {

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

        Label hello = new Label("Hello");
        hello.setTranslateX(250);
        hello.setTranslateY(38);

        Scene managerWelcome = new Scene(subSection);

        topSection.getChildren().add(userManager);
        subSection.getChildren().addAll(topSection, hello);

        return managerWelcome;
    }
}
