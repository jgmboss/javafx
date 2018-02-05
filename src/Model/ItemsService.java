package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemsService {
    public static void selectAll(List<Items> targetList, DatabaseConnection itemsDatabase) {

        PreparedStatement statement = itemsDatabase.newStatement("SELECT ItemID, ItemIMG, ItemName, ItemDescription, SellingPrice, BuyingPrice, Groups, Quantity, ItemIMG FROM Items ORDER BY ItemID");

        try {
            if (statement != null) {

                ResultSet results = itemsDatabase.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Items(results.getInt("ItemID"), results.getString("ItemName"), results.getString("ItemDescription"), results.getDouble("SellingPrice"), results.getDouble("BuyingPrice"), results.getString("Groups"), results.getInt("Quantity"), results.getString("itemIMG")));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static Items selectById(int id, DatabaseConnection itemDatabase) {

        Items result = null;

        PreparedStatement statement = itemDatabase.newStatement("SELECT itemID, itemName, ItemDescription, sellingPrice, buyingPrice, groups, quantity, itemIMG FROM Table WHERE itemID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = itemDatabase.executeQuery(statement);

                if (results != null) {
                    result = new Items(results.getInt("itemID"), results.getString("itemName"), results.getString("ItemDescription"), results.getDouble("sellingPrice"), results.getDouble("buyingPrice"), results.getString("groups"), results.getInt("quantity"), results.getString("itemIMG"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;


    }
    public static void save(Items itemToSave, DatabaseConnection database) {

        Items existingItem = null;
        if (itemToSave.getItemID() != 0) existingItem = selectById(itemToSave.getItemID(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Items (userFN, userLN, userIMG, manager, active, userUN, userPass) VALUES (?, ?, ?, ?, ?, ?, ?)");
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
}