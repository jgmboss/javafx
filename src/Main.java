import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage stage) throws Exception {

            BorderPane root = new BorderPane();
            root.setStyle("-fx-background-color: darkgray");

            Scene scene = new Scene(root, 700, 400);

            stage.setTitle("My JAVAFX");
            stage.setScene(scene);
            stage.show();

            HBox leftAndRightBox = new HBox(20);
            leftAndRightBox.setAlignment(Pos.CENTER_LEFT);

            Button bottomButton1 = new Button("I am on the left.");
            leftAndRightBox.getChildren().add(bottomButton1);

            Button bottomButton2 = new Button("I am also on the left.");
            leftAndRightBox.getChildren().add(bottomButton2);

            HBox rightSection = new HBox(20);
            HBox.setHgrow(rightSection, Priority.ALWAYS);
            rightSection.setAlignment(Pos.CENTER_RIGHT);

            Button bottomButton3 = new Button("I am on the right.");
            rightSection.getChildren().add(bottomButton3);
            leftAndRightBox.getChildren().add(rightSection);


            TabPane centerPane = new TabPane();

            Tab numbersTab = new Tab();
            numbersTab.setText("View");
            numbersTab.setClosable(false);
            VBox numbersVBox = new VBox(20);
            numbersVBox.setPadding(new Insets(20));
            numbersVBox.getChildren().add(new Button("One"));
            numbersVBox.getChildren().add(new Button("Two"));
            numbersVBox.getChildren().add(new Button("Three"));
            numbersTab.setContent(numbersVBox);

            Tab coloursTab = new Tab();
            coloursTab.setText("Edit");
            coloursTab.setClosable(false);
            VBox coloursVBox = new VBox(20);
            coloursVBox.setPadding(new Insets(20));
            coloursVBox.getChildren().add(new Button("Red"));
            coloursVBox.getChildren().add(new Button("Green"));
            coloursVBox.getChildren().add(new Button("Blue"));
            coloursTab.setContent(coloursVBox);

            centerPane.getTabs().addAll(numbersTab, coloursTab);

            BorderPane.setAlignment(centerPane, Pos.CENTER);

            centerPane.setStyle("-fx-background-color: white");

            VBox centerPadding = new VBox();
            centerPadding.setPadding(new Insets(30));
            centerPadding.getChildren().add(centerPane);

            root.setCenter(centerPadding);
        }
        public static void main(String[] args) {
            launch(args);
        }
    }