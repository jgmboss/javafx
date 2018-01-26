package Controller;

import Model.UserService;
import Model.Users;
import Views.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class LoginController {
public static String currentUserFN;
    public static void Temp() {

        System.out.println("It works!");

    }

    public static void tryLogin() {
        System.out.println("Trying login...");

        String requestedUser = Login.usernameIn.getText();
        String requestedPassword = Login.passwordIn.getText();
        String hash = SignUpController.passwordHasher(requestedPassword);
        //String managers = "Manager";


        //Main.stage.setScene(Welcome.welcome());
        System.out.println("Trying to log in as " + requestedUser + " with password hash " + hash);

        ArrayList<Users> userList = UserService.selectAll(MainController.usersDatabase);

        for (Users u : userList) {

            System.out.println("Testing user " + u.getUserUN() + " with hash " + u.getUserPass());

            if (u.getUserUN().equals(requestedUser)) {

                if (u.getUserPass().equals(hash)) {
                    Main.stage.setScene(ManagerWelcome.managerWelcome());       //LOGIN SUCCESSFUL
                    activeCheck(u.getUserID());

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Wrong Password or Username");
                    alert.setHeaderText(null);
                    alert.setContentText("Password or username is incorrect");
                    alert.showAndWait();
                }
                break;
            }

        }
    }
    public static void activeCheck(int userID){
        Users user = UserService.selectById(userID, MainController.usersDatabase);
        System.out.println(userID);
        if (user.isActive()) {
            managerCheck(user);
            currentUserFN = user.getUserFN();
        }
        else {
            inactiveError();
        }
    }

    public static void managerCheck(Users currentUser) {
        if (currentUser.isManager()) {
            Main.stage.setScene(ManagerWelcome.managerWelcome());       //LOGIN SUCCESSFUL
        } else {
            Main.stage.setScene(Welcome.welcome());
        }
    }



    public static void newUser() {
        Main.stage.setScene(SignUp.signUp());
    }

    public static void inactiveError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("This Account has been deactivated");
        alert.setHeaderText(null);
        alert.setContentText("Please request a manager to activate account");
        alert.showAndWait();
    }
}