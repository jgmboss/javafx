package Model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Users {

    private SimpleIntegerProperty userID;
    private final SimpleStringProperty userFN;
    private final SimpleStringProperty userLN;
    private final SimpleStringProperty userIMG;
    private final SimpleBooleanProperty manager;
    private final SimpleBooleanProperty active;
    private final SimpleStringProperty userUN;
    private final SimpleStringProperty userPass;

    public Users(int userID, String userFN, String userLN, String userIMG, boolean manager, boolean active, String userUN, String userPass) {
        this.userID = new SimpleIntegerProperty(userID);
        this.userFN =  new SimpleStringProperty(userFN);
        this.userLN =  new SimpleStringProperty(userLN);
        this.userIMG = new SimpleStringProperty(userIMG);
        this.manager =  new SimpleBooleanProperty(manager);
        this.active =  new SimpleBooleanProperty(active);
        this.userUN =  new SimpleStringProperty(userUN);
        this.userPass =  new SimpleStringProperty(userPass);
    }

    public int getUserID() {
        return userID.get();
    }

    public SimpleIntegerProperty userIDProperty() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID.set(userID);
    }

    public String getUserFN() {
        return userFN.get();
    }

    public SimpleStringProperty userFNProperty() {
        return userFN;
    }

    public void setUserFN(String userFN) {
        this.userFN.set(userFN);
    }

    public String getUserIMG() {
        return userIMG.get();
    }

    public SimpleStringProperty userIMGProperty() {
        return userIMG;
    }

    public void setUserIMG(String userIMG) {
        this.userIMG.set(userIMG);
    }

    public String getUserLN() {
        return userLN.get();
    }

    public SimpleStringProperty userLNProperty() {
        return userLN;
    }

    public void setUserLN(String userLN) {
        this.userLN.set(userLN);
    }

    public boolean isManager() {
        return manager.get();
    }

    public SimpleBooleanProperty managerProperty() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager.set(manager);
    }

    public boolean isActive() {
        return active.get();
    }

    public SimpleBooleanProperty activeProperty() {
        return active;
    }

    public void setActive(boolean active) {
        this.active.set(active);
    }

    public String getUserUN() {
        return userUN.get();
    }

    public SimpleStringProperty userUNProperty() {
        return userUN;
    }

    public void setUserUN(String userUN) {
        this.userUN.set(userUN);
    }

    public String getUserPass() {
        return userPass.get();
    }

    public SimpleStringProperty userPassProperty() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass.set(userPass);
    }

    @Override
    public String toString() {
        return userFN +" " + userLN + " "+ userIMG +" "+ userUN + " "+userPass;
    }
}

