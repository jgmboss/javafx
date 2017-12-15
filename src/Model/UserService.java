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
    public static Users selectById(int id, DatabaseConnection UserDatabase) {

        Users result = null;

        PreparedStatement statement = UserDatabase.newStatement("SELECT userFN, userIMG, userLN, manager, active, userID FROM Users WHERE itemID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = UserDatabase.executeQuery(statement);

                if (results != null) {
                    result = new Users(results.getString("userFN"), results.getString("userIMG"), results.getString("userLN"), results.getBoolean("manager"), results.getBoolean("active"), results.getInt("userID"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;

    }

    public static void save(Users itemToSave, DatabaseConnection database) {

        Users existingItem = null;
        if (itemToSave.getUserID() != 0) existingItem = selectById(itemToSave.getUserID(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Users (userFN, userIMG, userLN, manager, active,) VALUES (?, ?, ?, ?, ?))");
                statement.setString(1, itemToSave.getUserFN());
                statement.setString(2, itemToSave.getUserIMG());
                statement.setString(3, itemToSave.getUserLN());
                statement.setBoolean(4, itemToSave.isManager());
                statement.setBoolean(5, itemToSave.isActive());
                database.executeUpdate(statement);
            }
            else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET userFN = ?, userIMG = ?, userLN = ?, manager = ?, active = ? WHERE userID = ?");
                statement.setString(1, itemToSave.getUserFN());
                statement.setString(2, itemToSave.getUserIMG());
                statement.setString(3, itemToSave.getUserLN());
                statement.setBoolean(4, itemToSave.isManager());
                statement.setBoolean(5, itemToSave.isActive());
                statement.setInt(6, itemToSave.getUserID());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
    public static void deleteById(int id, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("DELETE FROM Users WHERE userID = ?");

        try {
            if (statement != null) {
                statement.setInt(1, id);
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database deletion error: " + resultsException.getMessage());
        }
    }

}

