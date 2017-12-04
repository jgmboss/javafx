
//import Model.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application{

    Scene login;
    Scene signUp;

    //Under 'public class Main extends Application {'
    @Override
    public void start (Stage stage) throws Exception {

        stage.setTitle("Inventory");
        stage.show();

        //scene.getStylesheets().add("CSS.css");

        Pane subSection = new Pane(); //this will be the template for all the scenes so it looks professional 
        subSection.setPrefSize(586, 263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle( "-fx-background-color: Darkgray;"
        );

        Scene startScene = new Scene(subSection, 586, 350); //creates new scene with my template and the size of the scene (which will always be the same)
        //these are things that will be in the startScene scene

        Button toLogin = new Button("Enter");
        toLogin.setPrefSize(162, 31);
        toLogin.setOnAction((ActionEvent ae) -> System.out.println("It Works!")); //stage.setScene(login)); //once clicked, login scene opens
        toLogin.setTranslateX(212);
        toLogin.setTranslateY(192);

        subSection.getChildren().add(toLogin);

        Label welcomeTxt = new Label("Welcome to the");
        Label inventory = new Label("inventory application");
        welcomeTxt.setTranslateX(250);
        welcomeTxt.setTranslateY(38);
        inventory.setTranslateX(235);
        inventory.setTranslateY(57);

        subSection.getChildren().add(welcomeTxt);
        subSection.getChildren().add(inventory);

        stage.setScene(startScene);
    }

    /* public void accounts (Stage stage) throws Exception {
    ObservableList<Users> users = FXCollections.observableArrayList(
    new Users("Jacob", ":)", "smith"),
    new Users("Isabella", ":)", "Johnson"),
    new Users("Ethan", ":)", "Williams"),
    new Users("Emma", ":)", "Jones"),
    new Users("Michael", ":)", "brown")
    );
     */

    public static void main(String[] args) {
        launch(args);
    }
}
