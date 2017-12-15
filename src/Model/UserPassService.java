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
                          targetList.add(new UserPass (results.getString("userUN"),results.getInt("userID"), results.getString("userPass")));
                      }
                  }
              }
          } catch (SQLException resultsException) {
              System.out.println("Database select all error: " + resultsException.getMessage());
          }
      }
    }
