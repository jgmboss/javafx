//import Controller.MainController;
import Model.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
   // private static MainController controller;

    private static TableView<Users> usersTableView = new TableView<>();

    private void doSomething(){
        System.out.println("hello");

    }

    public static void main(String[] args) {

      //  controller = new MainController(usersTableView);

        launch(args);
    }
        @Override
        public void start(Stage stage) throws Exception {

            Pane root = new Pane();

            Scene scene = new Scene(root, 768, 468);

            stage.setTitle("Inventory");
            stage.setScene(scene);
            stage.show();

            VBox boxOfButtons = new VBox(10);

            Button[] myButtons = new Button[5];

            Button myButton = new Button("Click me!");
            myButton.setPrefSize(100, 35);
           myButton.setOnAction((ActionEvent ae) -> ());
            root.getChildren().add(myButton);


            boxOfButtons.getChildren().addAll(myButtons);

            root.getChildren().add(boxOfButtons);

        }

    }



