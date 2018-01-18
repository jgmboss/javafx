package Model;

public class Users {

    private int userID;
    private String userFN;
    private String userIMG;
    private String userLN;
    private Boolean manager;
    private Boolean active;
private String userUN;
private String userPass;


    public Users(int userID, String userFN, String userIMG, String userLN, Boolean manager, Boolean active, String userUN, String userPass) {
        this.userID = userID;
        this.userFN = userFN;
        this.userIMG = userIMG;
        this.userLN = userLN;
        this.manager = manager;
        this.active = active;
        this.userUN = userUN;
        this.userPass = userPass;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

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

    public String getUserUN() {
        return userUN;
    }

    public void setUserUN(String userUN) {
        this.userUN = userUN;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return userFN + userIMG + userLN + userUN  + userPass;
    }
}

