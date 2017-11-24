package Model;

public class Users {

    private String userFN;
    private String userLN;
    private String userIMG;
    private Boolean manager;
    private Boolean active;
    private int userID;

    public Users(String userFN, String userIMG, String userLN, Boolean manager, Boolean active, int userID) {
        this.userFN = userFN;
        this.userIMG = userIMG;
        this.userLN = userLN;
        this.manager = manager;
        this.active = active;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return userFN + userIMG + userLN;
    }

}

