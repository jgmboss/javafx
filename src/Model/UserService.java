package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserService {
    public static void selectAll(List<Items> targetList, DatabaseConnection userDatabase) {

        PreparedStatement statement = userDatabase.newStatement("SELECT userFN, userLN, userIMG, manager, active, userID FROM Items ORDER BY userID");

        try {
            if (statement != null) {

                ResultSet results = userDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Users (results.getString("userFN"), results.getString("userLN"), results.getString("userIMG"), results.getBoolean("manager"), results.getBoolean("active"),results.getInt("userID")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }
}
