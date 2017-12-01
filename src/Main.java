import Model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;


import java.util.ArrayList;


public class Main extends Application{




    //Under 'public class Main extends Application {'
    @Override
    public void start (Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 768, 468);

        stage.setTitle("Inventory");
        stage.setScene(scene);
        stage.show();

        scene.getStylesheets().add("CSS.css");

        HBox subSection = new HBox();
        Button myButton = new Button("Enter");
        myButton.setPrefSize(100, 35);
        myButton.setOnAction((ActionEvent ae) -> System.out.println("hello"));
        myButton.setTranslateX(330);
        myButton.setTranslateY(400);
        root.getChildren().add(myButton);
        centerPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(centerPane, Pos.CENTER);
        centerPane.getStyleClass().add("centerPane");
        
        
        

    }
    public void accounts (Stage stage) throws Exception {

        ObservableList<Users> users = FXCollections.observableArrayList(
                new Users("Jacob", ":)", "smith"),
                new Users("Isabella", ":)", "Johnson"),
                new Users("Ethan", ":)", "Williams"),
                new Users("Emma", ":)", "Jones"),
                new Users("Michael", ":)", "brown")
        );

    }

    public static void main(String[] args) {
    launch(args);
        }
}


