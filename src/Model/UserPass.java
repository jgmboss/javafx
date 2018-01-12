package Model;

public class UserPass {

    private int userID;
    private String userUN;
    private String userPass;

    public UserPass(String userUN, int userID, String userPass) {
        this.userUN = userUN;
        this.userID = userID;
        this.userPass = userPass;
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

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return userUN + userPass;
    }
}
