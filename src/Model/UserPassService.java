package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class UserPassService {

    /*  public static void selectAll(List<UserPass> targetList, DatabaseConnection database) { }
      public static UserPass selectById(int id, DatabaseConnection database) { }
      public static void save(UserPass userPass, DatabaseConnection database) { }	// insert & update
      public static void deleteById(int id, DatabaseConnection database) { }
*/
    public static void selectAll(List<UserPass> targetList, DatabaseConnection userPassDatabase) {

        PreparedStatement statement = userPassDatabase.newStatement("SELECT userID, userUN, userPass FROM UserPass ORDER BY userID");

        try {
            if (statement != null) {

                ResultSet results = userPassDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new UserPass(results.getString("userUN"), results.getInt("userID"), results.getString("userPass")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static UserPass selectById(int id, DatabaseConnection UserPassDatabase) {

        UserPass result = null;

        PreparedStatement statement = UserPassDatabase.newStatement("SELECT userID, userUN, userPass Users WHERE itemID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = UserPassDatabase.executeQuery(statement);

                if (results != null) {
                    result = new UserPass(results.getString("userUN"), results.getInt("userID"), results.getString("userPass"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;

    }

    public static void save(UserPass itemToSave, DatabaseConnection database) {

        UserPass existingItem = null;
        if (itemToSave.getUserID() != 0) existingItem = selectById(itemToSave.getUserID(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Users (userID, userUN, userPass) VALUES (?, ?, ?))");
                statement.setInt(1, itemToSave.getUserID());
                statement.setString(2, itemToSave.getUserUN());
                statement.setString(3, itemToSave.getUserPass());
                database.executeUpdate(statement);
            } else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET userUN = ?, userPass = ? WHERE userID = ?");
                statement.setInt(1, itemToSave.getUserID());
                statement.setString(2, itemToSave.getUserUN());
                statement.setString(3, itemToSave.getUserPass());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
}