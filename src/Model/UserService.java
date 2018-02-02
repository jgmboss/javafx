package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static ArrayList<Users> selectAll(DatabaseConnection userDatabase) {

        PreparedStatement statement = userDatabase.newStatement("SELECT userID, userFN, userLN, userIMG, manager, active, userUN, userPass FROM Users ORDER BY userID");
        ArrayList<Users> resultsList = new ArrayList<>();

        try {
            if (statement != null) {

                ResultSet results = userDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        resultsList.add(new Users (results.getInt("userID"), results.getString("userFN"), results.getString("userLN"), results.getString("userIMG"), results.getBoolean("manager"), results.getBoolean("active"), results.getString("userUN"), results.getString("userPass")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }

        return resultsList;

    }
    public static Users selectById(int id, DatabaseConnection UserDatabase) {

        Users result = null;

        PreparedStatement statement = UserDatabase.newStatement("SELECT userID, userFN, userLN, userIMG, manager, active, userUN, userPass FROM Users WHERE userID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = UserDatabase.executeQuery(statement);

                if (results != null) {
                    result = new Users(results.getInt("userID"), results.getString("userFN"), results.getString("userLN"), results.getString("userIMG"), results.getBoolean("manager"), results.getBoolean("active"), results.getString("userUN"), results.getString("userPass"));
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
                PreparedStatement statement = database.newStatement("INSERT INTO Users (userFN, userLN, userIMG, manager, active, userUN, userPass) VALUES (?, ?, ?, ?, ?, ?, ?)");
                statement.setString(1, itemToSave.getUserFN());
                statement.setString(2, itemToSave.getUserLN());
                statement.setString(3, itemToSave.getUserIMG());
                statement.setBoolean(4, itemToSave.isManager());
                statement.setBoolean(5, itemToSave.isActive());
                statement.setString(6, itemToSave.getUserUN());
                statement.setString(7, itemToSave.getUserPass());
                database.executeUpdate(statement);
            }
            else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET userFN = ?, userLN = ?, userIMG = ?, manager = ?, active = ?, userUN = ?, userPass = ? WHERE userID = ?");
                statement.setString(1, itemToSave.getUserFN());
                statement.setString(2, itemToSave.getUserLN());
                statement.setString(3, itemToSave.getUserIMG());
                statement.setBoolean(4, itemToSave.isManager());
                statement.setBoolean(5, itemToSave.isActive());
                statement.setString(6, itemToSave.getUserUN());
                statement.setString(7, itemToSave.getUserPass());
                statement.setInt(8, itemToSave.getUserID());
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

