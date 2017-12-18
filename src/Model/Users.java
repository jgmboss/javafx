package Model;

//import javafx.beans.property.SimpleBooleanProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleStringProperty;


public class Users {

    /*private final SimpleStringProperty userFN;
    private final SimpleStringProperty userIMG;
    private final SimpleStringProperty userLN;
    private final SimpleBooleanProperty manager;
    private final SimpleBooleanProperty active;
    private final SimpleIntegerProperty userID;
*/
    private String userFN;
    private String userIMG;
    private String userLN;
    private Boolean manager;
    private Boolean active;
    private int userID;

    public Users(String userFN, String userIMG, String userLN, Boolean manager, Boolean active, int userID) {
        /*this.userFN  = new SimpleStringProperty(userFN);
        this.userIMG = new SimpleStringProperty(userIMG);
        this.userLN  = new SimpleStringProperty(userLN);
        this.manager = new SimpleBooleanProperty(manager);
        this.active  = new SimpleBooleanProperty(active);
        this.userID  = new SimpleIntegerProperty(userID);
        */
        this.userFN = userFN;
        this.userIMG = userIMG;
        this.userLN = userLN;
        this.manager = manager;
        this.active = active;
        this.userID = userID;
    }

   /* public String getUserFN() {
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

    public int getUserID() {
        return userID.get();
    }

    public SimpleIntegerProperty userIDProperty() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID.set(userID);
    }
*/

    public String getUserFN() {
        return userFN;
    }

    public void setUserFN(String userFN) {
        this.userFN = userFN;
    }

    public String getUserIMG() {
        return userIMG;
    }

    public void setUserIMG(String userIMG) {
        this.userIMG = userIMG;
    }

    public String getUserLN() {
        return userLN;
    }

    public void setUserLN(String userLN) {
        this.userLN = userLN;
    }

    public Boolean getManager() {
        return manager;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return userFN +" " + userIMG + " " + userLN;
    }


}

