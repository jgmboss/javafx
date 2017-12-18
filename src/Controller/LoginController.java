package Controller;

import Model.UserPass;
import Model.UserPassService;
import Model.UserService;
import Views.Login;
import Views.Main;
import Views.SignUp;
import Views.Welcome;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class LoginController {

    public static void Temp (){

        System.out.println("It works!");

    }

    public static void tryLogin() {
        //System.out.println("Trying login...");

        /*String requestedUser = Login.usernameIn.getText();
        String requestedPassword = Login.passwordIn.getText();

        System.out.println("Trying to log in as " + requestedUser);

        ArrayList<UserPass> testList = new ArrayList<>();
        UserPassService.selectAll(testList, MainController.usersDatabase);

        for (UserPass u: testList) {

            if (u.getUserUN() == requestedUser && u.getUserPASS() == requestedPassword) {
                Main.stage.setScene(Welcome.welcomeScene());
            }
            else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Wrong Password or Username");
                    alert.setHeaderText(null);
                    alert.setContentText("Beans");
                    alert.showAndWait();

            }*/
        Main.stage.setScene(Welcome.welcome());
        }


    public static void newUser() {
        Main.stage.setScene(SignUp.signUp());
    }

}
