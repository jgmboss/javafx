package Controller;

import Model.UserService;
import Model.Users;
import Views.*;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class LoginController {

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

        ArrayList<Users> userList = new ArrayList<>();
        UserService.selectAll(userList, MainController.usersDatabase);

        for (Users u : userList) {

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
        UserService.selectById(userID, MainController.usersDatabase);
        System.out.println(userID);
        /*if (currentUser.getActive() == true){
            managerCheck(currentUser);
        }
        else{
            inactiveError();
        }*/
    }
public static void managerCheck(Users currentUser){
    if (currentUser.getManager() == true) {
        Main.stage.setScene(ManagerWelcome.managerWelcome());       //LOGIN SUCCESSFUL
    }
        else{
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