import com.sun.javafx.fxml.builder.JavaFXSceneBuilder;
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
            root.getStyleClass().add("root");

            Scene scene = new Scene(root, 700, 400);
            scene.getStylesheets().add("CSS.css");
            stage.setTitle("My JAVAFX");
            stage.setScene(scene);
            stage.show();

            HBox leftAndRightBox = new HBox(200);
            leftAndRightBox.setAlignment(Pos.CENTER_LEFT);


            TabPane centerPane = new TabPane ();
            centerPane.setPadding(new Insets(20,0,0,0));
            centerPane.getStyleClass().add("tabPane");

            Tab viewTab = new Tab();
            viewTab.setText("View");
            viewTab.setClosable(false);
            VBox viewVBox = new VBox(10);
            viewVBox.setPadding(new Insets(100));
            viewVBox.getChildren().add(new Button("One"));
            viewVBox.getChildren().add(new Button("Two"));
            viewVBox.getChildren().add(new Button("Three"));
            viewTab.setContent(viewVBox);
            viewTab.getStyleClass().add("tabs");

            Tab editTab = new Tab();
            editTab.setText("Edit");
            editTab.setClosable(false);
            VBox editVBox = new VBox(10);
            editVBox.setPadding(new Insets(100));
            editVBox.getChildren().add(new Button("Red"));
            editVBox.getChildren().add(new Button("Green"));
            editVBox.getChildren().add(new Button("Blue"));
            editTab.setContent(editVBox);

            centerPane.getTabs().addAll(viewTab, editTab);

            BorderPane.setAlignment(centerPane, Pos.CENTER);



           VBox centerPadding = new VBox();
            centerPadding.setPadding(new Insets(10));
            centerPadding.getChildren().add(centerPane);

            root.setCenter(centerPadding);
        }
        public static void main(String[] args) {
            launch(args);
        }
    }