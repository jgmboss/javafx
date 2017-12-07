package Views;
//import Model.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    public static Stage stage;
    Scene login;
    Scene signUp;




    //Under 'public class Views.Main extends Application {'
    @Override
    public void start (Stage stage) throws Exception {

        Main.stage = stage;

        Main.stage.setTitle("Inventory");
        Main.stage.show();

        Pane subSection = new Pane(); //this will be the template for all the scenes so it looks professional
        //below is what the subsection looks like, this will be repeated in all the views
        subSection.setPrefSize(586,263);
        subSection.setTranslateX(0);
        subSection.setTranslateY(80);
        subSection.setStyle("-fx-background-color: Darkgray;");

        Scene startScene = new Scene(subSection, 586, 350); //creates new scene with my template and the size of the scene (which will always be the same)
        //these are things that will be in the startScene scene

        Button toLogin = new Button("Enter");
        toLogin.setPrefSize(162, 31);
        toLogin.setOnAction((ActionEvent ae) -> Main.stage.setScene(Login.login())); //once clicked, Login scene opens
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

        Main.stage.setScene(startScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
