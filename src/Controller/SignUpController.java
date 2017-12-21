package Controller;

import Views.Login;
import Views.Main;
import Views.SignUp;
import javafx.scene.control.Alert;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static Views.SignUp.*;

public class SignUpController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }

    /*public static void madeNewAccount(){

        if (passIn == null | passIn2 == null | fNameIn == null | lNameIn == null | usernameIn == null) {

            nullError();
        }
        else if(passIn.getText() != passIn2.getText()) {
            passwordError();
        }
        else {
            //store input into database
            String inPass = SignUp.passIn.getText();
            System.out.println(inPass);
            Main.stage.setScene(Login.login());
            System.out.println(passwordHasher(inPass));
            }
        //else {
            

        //}
    }*/
    public static void madeNewAccount() {
        String inPass = passIn.getText();
        String inPass2 = passIn2.getText();
        if (passIn2.getText().isEmpty() || passIn.getText().isEmpty() || fNameIn.getText().isEmpty() || lNameIn.getText().isEmpty() || usernameIn.getText().isEmpty()){
            nullError();
        }
        else if (usernameIn.getText().length() < 5){
            usernameError();

        }
        else if (inPass.equals(inPass2)){
            System.out.println(passwordHasher(inPass));
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
}




