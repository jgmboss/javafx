package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserService {
    public static void selectAll(List<Users> targetList, DatabaseConnection userDatabase) {

        PreparedStatement statement = userDatabase.newStatement("SELECT userFN, userSN, userIMG, manager, active, userID FROM Users ORDER BY userID");

        try {
            if (statement != null) {

                ResultSet results = userDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Users (results.getString("userFN"), results.getString("userSN"), results.getString("userIMG"), results.getBoolean("manager"), results.getBoolean("active"),results.getInt("userID")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }
}
