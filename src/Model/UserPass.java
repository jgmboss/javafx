package Model;

public class UserPass {

    private int userID;
    private String userUN;
    private String userPASS;

    public UserPass(int userUN, String userID, String userPASS) {
        this.userUN = userUN;
        this.userID = userID;
        this.userPASS = userPASS;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserUN() {
        return userUN;
    }

    public void setUserUN(String userUN) {
        this.userUN = userUN;
    }

    public String getUserPASS() {
        return userPASS;
    }

    public void setUserPASS(String userPASS) {
        this.userPASS = userPASS;
    }

    @Override
    public String toString() {
        return userUN + userPASS;
    }
}
