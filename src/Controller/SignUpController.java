package Controller;

import Model.*;
import Views.Login;
import Views.Main;
import Views.SignUp;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class SignUpController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }

    public static void validateAccount() {

        String username = SignUp.usernameIn.getText();
        String firstname = SignUp.fNameIn.getText();
        String lastname = SignUp.lNameIn.getText();
        String inPass = SignUp.passIn.getText();
        String inPass2 = SignUp.passIn2.getText();

        if (    username.isEmpty() ||
                firstname.isEmpty() ||
                lastname.isEmpty() ||
                inPass.isEmpty() ||
                inPass2.isEmpty()){
                    nullError();
        }
        else if (username.length() < 5){
            usernameError();
        }
        else if (inPass.equals(inPass2)){

            String hash = passwordHasher(inPass);

            Users newUser = new Users(0, firstname, "", lastname, false, true, username, hash);
            UserService.save(newUser, MainController.usersDatabase);

            Main.stage.setScene(Login.login());

        }
        else{
            passwordError();
        }
    }

    public static void nullError(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Null Error");
        alert.setHeaderText("One or more of the information is missing");
        alert.setContentText("Please complete all required parts");

        alert.showAndWait();

    }
    public static void passwordError(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Password Error");
        alert.setHeaderText("Passwords do not match");
        alert.setContentText("Please renter the same password");

        alert.showAndWait();
    }
    public static void usernameError(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Username Error");
        alert.setHeaderText("Username must be at least 5 characters long");
        alert.setContentText("Please enter another username");

        alert.showAndWait();
    }

    public static String passwordHasher(String passwordIn)
    {
        try {
            MessageDigest hasher = MessageDigest.getInstance("SHA-1");
            hasher.update(passwordIn.getBytes());
            return DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase();
        } catch (NoSuchAlgorithmException nsae) {
            return nsae.getMessage();
        }
    }
    public static void addIMG(Button button) {
        /*final FileChooser fileChooser = new FileChooser();
        button.setOnAction(event -> {
            Window w
        });*/

    }
}




