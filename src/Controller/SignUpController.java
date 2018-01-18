package Controller;

import Model.*;
import Views.Login;
import Views.Main;
import Views.SignUp;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import static Views.SignUp.*;

public class SignUpController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void gotoLoginScreen() {
        Main.stage.setScene(Login.login());
    }

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
          //  UserPassService.save();
            Main.stage.setScene(Login.login());
        }
        else{
            passwordError();
        }
        madeNewAccount2();
    }

    public static void madeNewAccount2(){

        ArrayList<UserPass> userPassArrayList = new ArrayList<>();
        UserPassService.selectAll(userPassArrayList, MainController.usersDatabase);

        if

        Users newUser = new Users(fNameIn.getText(), "", lNameIn.getText(), false, true, 0);
        UserService.save(newUser, MainController.usersDatabase);


        String passIn = passwordHasher(passIn.getText());
        String inuserName = ;
        String inFN = ;
        String inLN = lNameIn.getText();

       // if (Items.){

       // }
        for (UserPass u: userPassArrayList) {
            System.out.println(u.getUserID() + u.getUserUN() + u.getUserPass());
            //Main.stage.setScene(Login.login());
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




