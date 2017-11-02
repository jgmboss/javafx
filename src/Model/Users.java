package Model;

public class Users {

    private int userID;
    private String userFN;
    private String userSN;

    public Users(int userID, String userFN, String userSN) {
        this.userID = userID;
        this.userFN = userFN;
        this.userSN = userSN;
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

    public String getUserSN() {
        return userSN;
    }

    public void setUserSN(String userSN) {
        this.userSN = userSN;
    }

    @Override
    public String toString() {
        return userFN +  userSN;
    }
}
}
